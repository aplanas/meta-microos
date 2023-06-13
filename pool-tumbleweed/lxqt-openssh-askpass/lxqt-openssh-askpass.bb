SUMMARY = "OpenSSH password tool"
DESCRIPTION = "Tool that will prompt user for password when using OpenSSH in LXQt"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-openssh-askpass-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "5a6f261f401c7d2cc9b5e3d91fbea6f6c6e20e180fcd08ce433625087dd447ac69fdf46ea06b6a6037a80f107f6ef068d740d3e86b40cc3d9278e55a4a1b4bba"

RPROVIDES:${PN} += "lxqt-openssh-askpass \
lxqt-openssh-askpass(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
liblxqt.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
