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

RPM_NAME = "cvsps-2.1-182.28.aarch64.rpm"
RPM_HASH = "ac729d5764c2f8be436dd8499fa66d1ac643af4ab5a39aca51580749a9ae48ac29e22c3f1562e4b9be80958e3fcf43480881cf8c0a3fb990774f3d738fdef7e7"

RPROVIDES:${PN} += "cvsps \
cvsps(aarch-64) \
cvsps2"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libz.so.1()(64bit)"

inherit rpm
