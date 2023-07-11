SUMMARY = "Compressed file format that allows easy deltas"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.1"

RPM_NAME = "zchunk-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "729b733408ff622ca5bbc259985d2c112bf685ad8bd9e596aeef7ccc626460bc96e9edf21a5c329be26ffd02c5d3b2d5d0a84e6844d8b38f8d64f61796128cfa"

RPROVIDES:${PN} += "bundled-buzhash-urlblock \
zchunk"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libzck.so.1 \
libzck1"

inherit rpm
