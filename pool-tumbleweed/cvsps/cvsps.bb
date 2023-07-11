SUMMARY = "A Program for Generating Patch Set Information from a CVS Repository"
DESCRIPTION = "CVSps is a program for generating 'patchset' information from a CVS \
repository. In this case, a patchset is defined as a set of changes \
made to a collection of files, all committed at the same time (using a \
single 'cvs commit' command). This information is valuable for seeing \
the big picture of the evolution of a CVS project. While CVS tracks \
revision information, it is often difficult to see what changes were \
'atomically' committed to the repository."
LICENSE = "GPL-2.0+"

PV = "2.1"

RPM_NAME = "cvsps-2.1-182.29.aarch64.rpm"
RPM_HASH = "ae9d8b729db27545dc71d8f9a60864d111c6fba4826fd709b6a056f72ea56d47ad56e2b7d700bc6a8b27bd9d11ca2e0b7abac22b9669333d902597145fa90556"

RPROVIDES:${PN} += "cvsps \
cvsps2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
