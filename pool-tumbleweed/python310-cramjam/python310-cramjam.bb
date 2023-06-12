SUMMARY = "Thin Python bindings to de/compression algorithms in Rust"
DESCRIPTION = "Extremely thin Python bindings to de/compression algorithms in Rust. \
Allows for using algorithms such as Snappy, without any system dependencies."
LICENSE = "MIT"

PV = "2.6.2"

RPM_NAME = "python310-cramjam-2.6.2-1.5.aarch64.rpm"
RPM_HASH = "91e1de81d69efd604a8329df8790915cee83ddf2c4846a4df3078f25a647670d79170fbeddeed817d521938878332ec51164290c47dd9a5ad1eca8b8fcc64476"

RPROVIDES:${PN} += "python3-cramjam \
python3.10dist(cramjam) \
python310-cramjam \
python310-cramjam(aarch-64) \
python3dist(cramjam)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
python(abi)"

inherit rpm
