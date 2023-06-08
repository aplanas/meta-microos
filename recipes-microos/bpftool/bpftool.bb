SUMMARY = "Tool for inspection and manipulation of BPF programs and maps"
DESCRIPTION = "bpftool allows for inspection and simple modification of BPF objects (programs \
and maps) on the system."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "bpftool-6.3.1-8.11.aarch64.rpm"
RPM_HASH = "71b6d8318d691261774c72af156e80f2b0c786749f1caa111897a29b81d12fdfb4eff60b944bbcea1d9a873e0c560883acddbf6ade1342d544cab1073c184c03"

RPROVIDES:${PN} += "bpftool bpftool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libelf.so.1()(64bit) libelf.so.1(ELFUTILS_1.0)(64bit) libelf.so.1(ELFUTILS_1.3)(64bit) libelf.so.1(ELFUTILS_1.5)(64bit) libelf.so.1(ELFUTILS_1.6)(64bit) libsframe.so.0()(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit)"

inherit rpm
