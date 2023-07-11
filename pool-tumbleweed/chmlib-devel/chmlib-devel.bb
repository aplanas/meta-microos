SUMMARY = "Documentation and Headers for chmlib"
DESCRIPTION = "This package contains the headers and documentation for the chmlib API \
that programmers will need to develop applications which use chmlib, \
the software library for dealing with Microsoft ITSS/CHM format files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.40"

RPM_NAME = "chmlib-devel-0.40-24.9.aarch64.rpm"
RPM_HASH = "68fb1d26175dca077d438b1fc1a5458b733a4cce3a69d73f1aac942e7aa68db49bd95332f2189092e968cb7fdd1dff6cdd9842f8ab352908789d696245d891b3"

RPROVIDES:${PN} += "chmlib-devel"

RDEPENDS:${PN} += "libchm0"

inherit rpm
