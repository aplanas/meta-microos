SUMMARY = "Declarative install for programs"
DESCRIPTION = "An helper tool that installs software and additional data into the system."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.0"

RPM_NAME = "rinstall-0.2.0-3.6.aarch64.rpm"
RPM_HASH = "fa911a82c5ab0ef31bb4f7d8f5bc5fd1bb147164383133d820de8efc14f40e1d46585a3cc87a7083b4ffd171f402ec8f1262ee5eeb0870704f5dc58e87fbe0a2"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-arrayref \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-bitflags \
bundled-rust-crate-blake3 \
bundled-rust-crate-block-buffer \
bundled-rust-crate-camino \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-color-eyre \
bundled-rust-crate-colored \
bundled-rust-crate-constant-time-eq \
bundled-rust-crate-crypto-common \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-eyre \
bundled-rust-crate-generic-array \
bundled-rust-crate-gimli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indenter \
bundled-rust-crate-indexmap \
bundled-rust-crate-json \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-owo-colors \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rinstall \
bundled-rust-crate-roff \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-strsim \
bundled-rust-crate-subtle \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-typenum \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
bundled-rust-crate-void \
bundled-rust-crate-walkdir \
bundled-rust-crate-xdg \
bundled-rust-crate-yaml-rust \
rinstall \
rpm-macro-rinstall"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
