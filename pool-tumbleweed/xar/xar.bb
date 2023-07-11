SUMMARY = "Extensible Archive Format Tools"
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

RPM_NAME = "xar-1.6.1-7.1.aarch64.rpm"
RPM_HASH = "fd71227791157ccb64e3fd4d17eae99f510f3ce6ef6f2c997259e67b64c98b770b8beed4c27a54e9ab0e6cfed62abdf0fd16699a2b494a9426a5063450092251"

RPROVIDES:${PN} += "xar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxar.so.1"

inherit rpm
