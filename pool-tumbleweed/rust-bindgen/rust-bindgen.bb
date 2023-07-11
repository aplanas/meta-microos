SUMMARY = "Automatically generates Rust FFI bindings to C and C++ libraries"
DESCRIPTION = "Automatically generates Rust FFI bindings to C (and some C++) libraries."
LICENSE = "BSD-3-Clause"

PV = "0.63.0"

RPM_NAME = "rust-bindgen-0.63.0-1.3.aarch64.rpm"
RPM_HASH = "5abb7552643a973d32f1d83d390e4573d999b0e6926fd65f6759f38dd36927830919a6a77e1abbb6399d11d3b33f8eedf92e16f077d94b70772b166e8a7a88e9"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bindgen \
bundled-rust-crate-bindgen-cli \
bundled-rust-crate-bitflags \
bundled-rust-crate-cexpr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clang-sys \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-either \
bundled-rust-crate-env-logger \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-humantime \
bundled-rust-crate-indexmap \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lazycell \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nom \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-peeking-take-while \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-shlex \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-which \
rust-bindgen"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
