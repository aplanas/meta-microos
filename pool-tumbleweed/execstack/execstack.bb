SUMMARY = "Utility to set/clear/query executable stack bit"
DESCRIPTION = "This package is built from prelink sources but contains just the \
execstack binary. It can be used to manipulate ELF binaries to run \
with or without executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "execstack-0.5.0-2.8.aarch64.rpm"
RPM_HASH = "87b2bfaaf20831286b151b5133bb4c3f342ad0868ff128290012c077ab57938759fadf04984ff54ce67bf4e14cfc290f960f600a77579c85f6b2f69490799b0d"

RPROVIDES:${PN} += "execstack \
execstack(aarch-64)"

RDEPENDS:${PN} += "coreutils \
findutils \
gawk \
glibc \
grep \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libelf.so.1()(64bit) \
libselinux.so.1()(64bit) \
util-linux"

inherit rpm
