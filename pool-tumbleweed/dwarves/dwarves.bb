SUMMARY = "DWARF utilities"
DESCRIPTION = "dwarves is a set of tools that use the DWARF debugging information \
inserted in ELF binaries by compilers such as GCC, used by well known \
debuggers such as GDB, and more recent ones such as systemtap. \
 \
Utilities in the dwarves suite include pahole, that can be used to \
find alignment holes in structs and classes in languages such as C, \
C++, but not limited to these. \
 \
It also extracts other information such as CPU cacheline alignment, \
helping pack those structures to achieve more cache hits. \
 \
A diff like tool, codiff can be used to compare the effects changes \
in source code generate on the resulting binaries. \
 \
Another tool is pfunct, that can be used to find all sorts of \
information about functions, inlines, decisions made by the compiler \
about inlining, etc."
LICENSE = "GPL-2.0-only"

PV = "1.25"

RPM_NAME = "dwarves-1.25-1.1.aarch64.rpm"
RPM_HASH = "2ffac1f6043f2b50422fc8e18b53df463fdcc39ef2eddc520f5eb57741066b4f201053c6a5f66c24097f1f6aa6a25000a42ef096503c29577437cae801bbae39"

RPROVIDES:${PN} += "dwarves \
dwarves(aarch-64) \
pahole"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbpf.so.1()(64bit) \
libbpf.so.1(LIBBPF_0.0.1)(64bit) \
libbpf.so.1(LIBBPF_0.1.0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdwarves.so.1()(64bit) \
libdwarves.so.1(DWARVES_1.25)(64bit) \
libdwarves_emit.so.1()(64bit) \
libdwarves_emit.so.1(DWARVES_1.25)(64bit) \
libdwarves_reorganize.so.1()(64bit) \
libdwarves_reorganize.so.1(DWARVES_1.25)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libelf.so.1(ELFUTILS_1.5)(64bit)"

inherit rpm
