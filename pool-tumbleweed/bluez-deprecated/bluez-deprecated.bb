SUMMARY = "Bluez tools that upstream considers obsolete"
DESCRIPTION = "This package contains tools from the bluez package that are only built \
if the '--enable-deprecated' switch is used. These are considered obsolete \
by the upstream developers and might contain serious issues, even security \
bugs. Use at your own risk. \
 \
Note that this package will go away before end of 2020, change your code \
to use the modern tools instead."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-deprecated-5.69-1.1.aarch64.rpm"
RPM_HASH = "5c9c93c61ca089bb9d576eef87d0f718995ee8a5b6147735d9943151eaed0b5e648ad75574a97eeb67ef0d4d8249370b33c5fdaca153afbd26e53023d21b7342"

RPROVIDES:${PN} += "bluez-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreadline.so.8 \
libudev.so.1"

inherit rpm
