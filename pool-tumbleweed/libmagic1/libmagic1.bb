SUMMARY = "Library for heuristic file type identification"
DESCRIPTION = "This library reads magic files and detects file types. Used by file command"
LICENSE = "BSD-2-Clause"

PV = "5.45"

RPM_NAME = "libmagic1-5.45-1.1.aarch64.rpm"
RPM_HASH = "10bb6d2e77c810954e7f121ad6b5f172911ec40a727a44b2401b222f362e498ab3749deef15d163316deff7c842942353354b08c33283315163e798506afffd9"

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
