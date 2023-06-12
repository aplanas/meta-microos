SUMMARY = "Replacement for ls written in Rust"
DESCRIPTION = "exa is a replacement for ls written in Rust. \
With similar but not identical options."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-0.10.1-3.4.aarch64.rpm"
RPM_HASH = "e9d5e672e5a181955594534b5b7f775e632dd7c06f90d923e2cb46b7ceef0abb82e3a24165acf78a33fc2963c18fcfce52e7e253992cd9cc4829acb979db9ffe"

RPROVIDES:${PN} += "exa \
exa(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libz.so.1()(64bit)"

inherit rpm
