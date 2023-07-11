SUMMARY = "Libraries needed to use Criterion"
DESCRIPTION = "This packages contains all the libraries needed to use Criterion."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "libcriterion3-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "0452adeb0fd4410c34bf2ef99f6ac250ad5e1e221c2d8db3226cadca427816aa79739e5e8fd9e86b3c670b846a9842f17f2a33f684b7b9ecfd289a4a788b6ba0"

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
