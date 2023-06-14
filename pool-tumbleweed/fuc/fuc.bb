SUMMARY = "Modern unix commands focused on performance"
DESCRIPTION = "The FUC-ing project provides modern unix commands focused on performance. \
This package provides the commands 'rmz' and 'cpz', with a CLI interface \
compatible with 'rm' and 'cp', respectively, in a 'zippy' faster version."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "fuc-1.1.7-1.1.aarch64.rpm"
RPM_HASH = "41632b1450c0c97d2dedab08c67c04f797cd064601ecb3596ecd093488d3a4a55927a1acff2e645d49d198fc9771c9a4e60a4add558d556f42f39f300d4f7c9d"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap2 \
bundled-rust-crate-cpz \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-error-stack \
bundled-rust-crate-fuc-engine \
bundled-rust-crate-heck \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rmz \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-typed-builder \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
fuc"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
