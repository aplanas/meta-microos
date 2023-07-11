SUMMARY = "Extensive Archive Format Library"
DESCRIPTION = "The XAR project aims to provide an easily extensible archive format. Important \
design decisions include an easily extensible XML table of contents for random \
access to archived files, storing the toc at the beginning of the archive to \
allow for efficient handling of streamed archives, the ability to handle files \
of arbitrarily large sizes, the ability to choose independent encodings for \
individual files in the archive, the ability to store checksums for individual \
files in both compressed and uncompressed form, and the ability to query the \
table of content's rich meta-data."
LICENSE = "BSD-3-Clause"

PV = "1.6.1"

RPM_NAME = "libxar-devel-1.6.1-7.1.aarch64.rpm"
RPM_HASH = "755700adbaa36f45e8e6df2d4bd358f376d50267f70b127fa037aefe1ac2a74dbd3f23e35f07ca74b2c8d3c24af231eb7a7592d0951d217e4a0fd3ac95333224"

RPROVIDES:${PN} += "libxar-devel"

RDEPENDS:${PN} += "libxar1"

inherit rpm
