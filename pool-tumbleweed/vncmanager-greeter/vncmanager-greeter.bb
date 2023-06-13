SUMMARY = "Greeter for VNC session manager"
DESCRIPTION = "This is graphical greeter that appears when VNC client connects to VNC manager."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "vncmanager-greeter-1.0.0-1.31.aarch64.rpm"
RPM_HASH = "35add32d02c0fc70e428ed3679e06ee8b9899b0f2094bde4efeb4bdf3246e7b5d22f5e48580d812145c7c3f186dd346b09363ec494e9f737e09aadfc422a4a51"

RPROVIDES:${PN} += "vncmanager-greeter \
vncmanager-greeter(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
