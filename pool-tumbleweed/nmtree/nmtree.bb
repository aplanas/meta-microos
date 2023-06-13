SUMMARY = "Utility for mapping directory hierarchies"
DESCRIPTION = "The mtree utility compares the file hierarchy rooted in the current \
directory against a specification read from the standard input. Messages \
are written to the standard output for any files whose characteristics do \
not match the specification, or which are missing from either the file \
hierarchy or the specification. \
 \
This is a port of the NetBSD version of mtree."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "nmtree-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "a002c748e5383f366b4e25c37574b9bcac87ea1b4afc29020ce02069ef12c281361275d1b0c0365941fc0e15ed15c1daeed1e14c5ce5110b5a7678efd8100036"

RPROVIDES:${PN} += "nmtree \
nmtree(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnbcompat.so.0()(64bit)"

inherit rpm
