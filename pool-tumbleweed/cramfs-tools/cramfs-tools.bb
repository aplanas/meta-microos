SUMMARY = "Tools for CramFs (Compressed ROM File System)"
DESCRIPTION = "This package contains tools that let you construct a CramFs \
(Compressed ROM File System) image from the contents of a given \
directory, as well as checking a constructed CramFs image and \
extracting its contents."
LICENSE = "GPL-2.0-only"

PV = "2.1"

RPM_NAME = "cramfs-tools-2.1-1.13.aarch64.rpm"
RPM_HASH = "9c49c6cbb09c118ce669f3dce821883e3ea2118d738d7b4335995f22e63ab6ce0fe9d01c5712840e29f563b5bf4799b3c8532dd1fec4f8d4d8071069ae8c969e"

RPROVIDES:${PN} += "cramfs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
