SUMMARY = "Library for heuristic file type identification"
DESCRIPTION = "This library reads magic files and detects file types. Used by file command"
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "libmagic1-5.44-2.3.aarch64.rpm"
RPM_HASH = "574e92b9e1265161c7039fba56c9694821c104787bd6a299000357b2405a303642d342ee4906a1c2b3ea3d1a29c2b83679e030a5c054d7662537834fd0ea361c"

RPROVIDES:${PN} += "file-/usr/lib64/libmagic.so.1 \
libmagic.so.1 \
libmagic1"

RDEPENDS:${PN} += "/sbin/ldconfig \
file-magic \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libz.so.1 \
libzstd.so.1"

inherit rpm
