SUMMARY = "Library for heuristic file type identification"
DESCRIPTION = "This library reads magic files and detects file types. Used by file command"
LICENSE = "BSD-2-Clause"

PV = "5.44"

RPM_NAME = "libmagic1-5.44-2.1.aarch64.rpm"
RPM_HASH = "096df23ad3dc476fb038bed3d928e5dbc0991a1e873b6b903e693e51f2b68de1b955211f3fdd430c84799267bdb312440305c4b5926280d0701c92069797c846"

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
