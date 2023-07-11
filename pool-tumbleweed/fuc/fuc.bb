SUMMARY = "Modern unix commands focused on performance"
DESCRIPTION = "The FUC-ing project provides modern unix commands focused on performance. \
This package provides the commands 'rmz' and 'cpz', with a CLI interface \
compatible with 'rm' and 'cp', respectively, in a 'zippy' faster version."
LICENSE = "Apache-2.0"

PV = "1.1.7"

RPM_NAME = "fuc-1.1.7-1.2.aarch64.rpm"
RPM_HASH = "cf5128755bb0a1299cce021949183396ed9806bc4996fa19b233e22459f1eba8fc8d2ee6a440412c8ac225d0f114a70c66e383baf162ad66a711eb152b7ee06f"

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
