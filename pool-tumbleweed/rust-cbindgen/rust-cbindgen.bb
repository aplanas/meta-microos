SUMMARY = "A tool for generating C bindings from Rust code"
DESCRIPTION = "A tool for generating C bindings from Rust code."
LICENSE = "MPL-2.0"

PV = "0.24.3+git0"

RPM_NAME = "rust-cbindgen-0.24.3+git0-1.4.aarch64.rpm"
RPM_HASH = "c4249b6bab5d0a7e7d2f540319b3606b9597fc5b1ac63307d28319a5946e45818bf43aa0784b045c59c9eafa9584593a8e17049d6ef83927ebfa4c10bd5cd1e9"

RPROVIDES:${PN} += "rust-cbindgen \
rust-cbindgen(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit)"

inherit rpm
