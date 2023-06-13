SUMMARY = "Provides textstyling for console output"
DESCRIPTION = "GNU libtextstyle provides an easy way to add styling to programs that produce output to a console or terminal emulator window. \
It does this in a way that allows the end user to customize the styling using the industry standard, namely Cascading Style Sheets (CSS)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "libtextstyle0-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "91ee6a8c47dc01c10264ce987a889a55988e12762e2507d8ac325413dc781e2eac520692adaae4e85166d566a2aecd5a66554dc77873c83fb1b153fade05226b"

RPROVIDES:${PN} += "libtextstyle.so.0()(64bit) \
libtextstyle0 \
libtextstyle0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
