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

RPM_NAME = "bluez-deprecated-5.66-1.8.aarch64.rpm"
RPM_HASH = "7a0d54ddc0c1028ff627dd9bdb8226ba5a9838b3c8d8f9196a03ed1867e1f0a57bef9833ec40f420e8e043107a903cc93cfa98889eaee7a51b5828bf52c18177"

RPROVIDES:${PN} += "bluez-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreadline.so.8 \
libudev.so.1"

inherit rpm
