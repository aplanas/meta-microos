SUMMARY = "Debuginfo extraction"
DESCRIPTION = "debugedit provides programs and scripts for creating debuginfo and source file distributions, \
collect build-ids and rewrite source paths in DWARF data for debugging, tracing and profiling."
LICENSE = "GPL-3.0-or-later"

PV = "5.0"

RPM_NAME = "debugedit-5.0-5.3.aarch64.rpm"
RPM_HASH = "c4938e9a5ded0e4f36caa47f9a7e547d15917f81fb302205f517867d376dc53cd47e39335ad5ffb3ad6c299ab689551dab0f7e8ddc5ec2bf158254b5eaae9fc4"

RPROVIDES:${PN} += "debugedit \
debugedit(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
binutils \
coreutils \
dwz \
elfutils \
findutils \
gawk \
grep \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdw.so.1()(64bit) \
libdw.so.1(ELFUTILS_0.167)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.3)(64bit) \
libelf.so.1(ELFUTILS_1.6)(64bit) \
sed \
xz"

inherit rpm
