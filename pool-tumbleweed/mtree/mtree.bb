SUMMARY = "Tool for creating and verifying file hierarchies"
DESCRIPTION = "The mtree utility compares the file hierarchy rooted in the current \
directory against a specification read from the standard input. Messages \
are written to the standard output for any files whose characteristics do \
not match the specifications, or which are missing from either the file \
hierarchy or the specification. \
 \
Note: This is an older FreeBSD version of mtree; a newer NetBSD version \
is also available in the package 'nmtree'."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "mtree-1.0.4-4.8.aarch64.rpm"
RPM_HASH = "5ec2893c693622525b0ff1480ee0020ddf55c1ef117c1a9d24a89cb9820cc7ee80f135ba9f3beb541c844e3bed61a93e7ba66b3104bcf6f36878e6528a90cc2f"

RPROVIDES:${PN} += "mtree"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
