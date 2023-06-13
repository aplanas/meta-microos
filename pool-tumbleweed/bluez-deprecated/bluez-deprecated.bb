SUMMARY = "Bluez tools that upstream considers obsolete"
DESCRIPTION = "This package contains tools from the bluez package that are only built \
if the '--enable-deprecated' switch is used. These are considered obsolete \
by the upstream developers and might contain serious issues, even security \
bugs. Use at your own risk. \
 \
Note that this package will go away before end of 2020, change your code \
to use the modern tools instead."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-deprecated-5.66-1.6.aarch64.rpm"
RPM_HASH = "12d282c8f2dcf0a822fcdc6ae0e28e55873666f5c7d7bd86130bd3d11afd9b4f1644495097109b24ca37233b18e3745a9525d3730a14832d4c81951aad93ef0c"

RPROVIDES:${PN} += "bluez-deprecated \
bluez-deprecated(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libreadline.so.8()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit) \
libudev.so.1(LIBUDEV_196)(64bit)"

inherit rpm
