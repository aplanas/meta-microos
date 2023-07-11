SUMMARY = "A tool to embed auditing information in ELF sections of rust binaries"
DESCRIPTION = "Know the exact crate versions used to build your Rust executable. Audit binaries for known bugs or \
security vulnerabilities in production, at scale, with zero bookkeeping. This works by embedding \
data about the dependency tree in JSON format into a dedicated linker section of the compiled \
executable."
LICENSE = "(Apache-2.0 | MIT) & Unicode-DFS-2016 & (0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & MIT"

PV = "0.6.0~0"

RPM_NAME = "cargo-auditable-0.6.0~0-1.3.aarch64.rpm"
RPM_HASH = "1cb00066a0dd589c7340e6abdfdb5edc00ea17ad310a9f194970a7f09cec7e0ac7e0b015f4f1a7444a4148be9eb238547b4b1fc981dc3d3190af48fea81fe483"

RPROVIDES:${PN} += "cargo-auditable"

RDEPENDS:${PN} += "cargo \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
