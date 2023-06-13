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

RPM_NAME = "libxar-devel-1.6.1-6.21.aarch64.rpm"
RPM_HASH = "5994c64a8d56acba83993aab6519878f1915a5e282f1c82ddd11d63a09d0707fccdc46bb4855c8c01f9a639c08339020a1f79723002a366a0e5e3773e3cd2a0c"

RPROVIDES:${PN} += "libxar-devel \
libxar-devel(aarch-64)"

RDEPENDS:${PN} += "libxar1"

inherit rpm
