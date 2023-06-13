SUMMARY = "Show User Information (Client)"
DESCRIPTION = "Finger is a utility that allows users to see information about system \
users (login name, home directory, name, and more) on local and remote \
systems."
LICENSE = "BSD-3-Clause"

PV = "1.3"

RPM_NAME = "finger-1.3-169.3.aarch64.rpm"
RPM_HASH = "739fe45f40adb24a39e4dfcc3f96fc212ed2645a5ac27bad8f91e57f666d15f3876e36069489bbcb98b3344103d5c290da211a49aa7f08a40a5005625e83fdf1"

RPROVIDES:${PN} += "finger \
finger(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnss_usrfiles2 \
netcfg"

inherit rpm
