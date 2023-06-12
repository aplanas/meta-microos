SUMMARY = "Automatically generates Rust FFI bindings to C and C++ libraries"
DESCRIPTION = "Automatically generates Rust FFI bindings to C (and some C++) libraries."
LICENSE = "BSD-3-Clause"

PV = "0.63.0"

RPM_NAME = "rust-bindgen-0.63.0-1.2.aarch64.rpm"
RPM_HASH = "f85efdd742c406d354ad66229dad4b4ffaca120f34369b7f23453f5846fd8c7f4e9dca8ca7330e8b5691ff11d45afa945f12988c8aed595341cb82e1f7c86dfe"

RPROVIDES:${PN} += "bundled(rust-crate:aho-corasick) \
bundled(rust-crate:atty) \
bundled(rust-crate:autocfg) \
bundled(rust-crate:bindgen) \
bundled(rust-crate:bindgen-cli) \
bundled(rust-crate:bitflags) \
bundled(rust-crate:cexpr) \
bundled(rust-crate:cfg-if) \
bundled(rust-crate:clang-sys) \
bundled(rust-crate:clap) \
bundled(rust-crate:clap_lex) \
bundled(rust-crate:either) \
bundled(rust-crate:env_logger) \
bundled(rust-crate:glob) \
bundled(rust-crate:hashbrown) \
bundled(rust-crate:humantime) \
bundled(rust-crate:indexmap) \
bundled(rust-crate:lazy_static) \
bundled(rust-crate:lazycell) \
bundled(rust-crate:libc) \
bundled(rust-crate:libloading) \
bundled(rust-crate:log) \
bundled(rust-crate:memchr) \
bundled(rust-crate:minimal-lexical) \
bundled(rust-crate:nom) \
bundled(rust-crate:os_str_bytes) \
bundled(rust-crate:peeking_take_while) \
bundled(rust-crate:proc-macro2) \
bundled(rust-crate:quote) \
bundled(rust-crate:regex) \
bundled(rust-crate:regex-syntax) \
bundled(rust-crate:rustc-hash) \
bundled(rust-crate:shlex) \
bundled(rust-crate:strsim) \
bundled(rust-crate:syn) \
bundled(rust-crate:termcolor) \
bundled(rust-crate:textwrap) \
bundled(rust-crate:unicode-ident) \
bundled(rust-crate:which) \
rust-bindgen \
rust-bindgen(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
