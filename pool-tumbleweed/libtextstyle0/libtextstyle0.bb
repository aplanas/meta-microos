SUMMARY = "Provides textstyling for console output"
DESCRIPTION = "GNU libtextstyle provides an easy way to add styling to programs that produce output to a console or terminal emulator window. \
It does this in a way that allows the end user to customize the styling using the industry standard, namely Cascading Style Sheets (CSS)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.21.1"

RPM_NAME = "libtextstyle0-0.21.1-2.2.aarch64.rpm"
RPM_HASH = "b9e304bd71e7c47c87554ecdaa3aa00c3aedf22165643fcde89833ef47cce5a5e3c5e25b75aa7dd977562833ec7abfd0a55d1b3daff6c7892eda6736003df9ad"

RPROVIDES:${PN} += "libtextstyle.so.0 \
libtextstyle0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
