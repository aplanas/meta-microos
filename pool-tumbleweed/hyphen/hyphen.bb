SUMMARY = "A text hyphenation library"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification."
LICENSE = "GPL-2.0+ | LGPL-2.0+ | MPL-1.1+"

PV = "2.8.8"

RPM_NAME = "hyphen-2.8.8-2.27.aarch64.rpm"
RPM_HASH = "4dcdb1844f3d2da8bc2c0701d3483876529a13d2d4e7c99306a84ae257c4f6bb38903e63602c3139965b67ac32442304dca23c2aafeb69075cef0d6a2b885d27"

RPROVIDES:${PN} += "hyphen"

RDEPENDS:${PN} += ""

inherit rpm
