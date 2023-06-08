SUMMARY = "A tool to embed auditing information in ELF sections of rust binaries"
DESCRIPTION = "Know the exact crate versions used to build your Rust executable. Audit binaries for known bugs or \
security vulnerabilities in production, at scale, with zero bookkeeping. This works by embedding \
data about the dependency tree in JSON format into a dedicated linker section of the compiled \
executable."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-WITH-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & MIT"

PV = "0.6.0~0"

RPM_NAME = "cargo-auditable-0.6.0~0-1.2.aarch64.rpm"
RPM_HASH = "a54784918a31c54bd5251e7522267762c06c394c9fe68ff6faaea73a4f23b0ae01e07e61fc3388b1a6da19f365022ec8640626f6eab3948969a7f8be7f36547b"

RPROVIDES:${PN} += "cargo-auditable cargo-auditable(aarch-64)"
RDEPENDS:${PN} += "cargo libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit)"

inherit rpm
