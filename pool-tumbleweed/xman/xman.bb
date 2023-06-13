SUMMARY = "Manual page display program for the X Window System"
DESCRIPTION = "xman is a graphical manual page browser."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "xman-1.1.5-2.3.aarch64.rpm"
RPM_HASH = "976f56574645fb16cae7fa0170cba8d36ba22dd0699a8d1e8e57197b006fdae4a43cb96cf6cce0ea4e8de76b45e80b6ad59b6ef39256e62e3980b88cd0e0231f"

RPROVIDES:${PN} += "xman \
xman(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXt.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
