SUMMARY = "Libraries needed to use Criterion"
DESCRIPTION = "This packages contains all the libraries needed to use Criterion."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libcriterion3-2.4.1-1.4.aarch64.rpm"
RPM_HASH = "4c43774cddb07e478a1885bcfaf2a1a4b1abfdf34a6ac99e1d7d55435068683dd74ebf801c9f4c65ebc0681ba63cf87ca393257698785fc9ee5e19120df76c71"

RPROVIDES:${PN} += "libcriterion.so.3 \
libcriterion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcriterion3-devel \
libffi.so.8 \
libgit2.so.1.6 \
libnanomsg.so.6 \
libprotobuf-nanopb.so.0"

inherit rpm
