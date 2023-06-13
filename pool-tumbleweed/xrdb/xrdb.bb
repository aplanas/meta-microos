SUMMARY = "X server resource database utility"
DESCRIPTION = "Xrdb is used to get or set the contents of the RESOURCE_MANAGER property \
on the root window of screen 0, or the SCREEN_RESOURCES property on the \
root window of any or all screens, or everything combined."
LICENSE = "MIT"

PV = "1.2.1"

RPM_NAME = "xrdb-1.2.1-3.1.aarch64.rpm"
RPM_HASH = "ebff5a19271af7bf458daddb2b1dfb061ba3aa4350a41e07459452b039e841646bfa60ef2b975698144f34c649be5d731afe6ac2c480d8fc57b1c97c12fce8d6"

RPROVIDES:${PN} += "xrdb \
xrdb(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXmuu.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
