SUMMARY = "Libraries needed to use Criterion"
DESCRIPTION = "This packages contains all the libraries needed to use Criterion."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "libcriterion3-2.4.2-1.2.aarch64.rpm"
RPM_HASH = "162bcf0ad91cd1edc657f4a1c4adaa93ae3533dda669176deaa2eb20ac5f394d7b7509d6d39185ddb423dee32ad03397a3f17c5d6999628e71e491d55de6ee3e"

RPROVIDES:${PN} += "libcriterion.so.3 \
libcriterion3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcriterion3-devel \
libffi.so.8 \
libgit2.so.1.7 \
libnanomsg.so.6 \
libprotobuf-nanopb.so.0"

inherit rpm
