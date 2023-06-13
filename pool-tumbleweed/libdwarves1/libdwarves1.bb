SUMMARY = "DWARF processing libraries of dwarves tools"
DESCRIPTION = "This package contains the libdwarves shared library for the dwarves \
toolset, providing processing for DWARF, a debugging data format \
for ELF files. \
 \
dwarves is a set of tools that use the DWARF debugging information \
inserted in ELF binaries by compilers such as GCC, used by well known \
debuggers such as GDB, and more recent ones such as systemtap."
LICENSE = "GPL-2.0-only"

PV = "1.25"

RPM_NAME = "libdwarves1-1.25-1.1.aarch64.rpm"
RPM_HASH = "682ab9c3d6882b615389bb3b3df64ff690cf4a36bce878489fdb2cb4c7d443d3a841f190fae7e432e90ebbd7e5e952fcc86b78a4a30b84d108b846468f916338"

RPROVIDES:${PN} += "libdwarves.so.1()(64bit) \
libdwarves1 \
libdwarves1(aarch-64) \
libdwarves_emit.so.1()(64bit) \
libdwarves_reorganize.so.1()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libbpf.so.1()(64bit) \
libc.so.6()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
libz.so.1()(64bit)"

inherit rpm
