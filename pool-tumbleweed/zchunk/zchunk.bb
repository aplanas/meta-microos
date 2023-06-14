SUMMARY = "Compressed file format that allows easy deltas"
DESCRIPTION = "zchunk is a compressed file format that splits the file into independent \
chunks.  This allows you to only download the differences when downloading a \
new version of the file, and also makes zchunk files efficient over rsync. \
zchunk files are protected with strong checksums to verify that the file you \
downloaded is in fact the file you wanted."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.3.0"

RPM_NAME = "zchunk-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "84f624504e0dd73b77ae0612d37e53ae14792224541cdffc0a59b521aecf2d6f0af896c5402b87f3e926515cc8a2bbf364533f8c34576369c1047a53298774f1"

RPROVIDES:${PN} += "bundled-buzhash-urlblock \
zchunk"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libzck.so.1 \
libzck1"

inherit rpm
