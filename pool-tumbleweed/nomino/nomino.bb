SUMMARY = "Batch rename utility for developers"
DESCRIPTION = "nomino is a batch rename utility for developers"
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.2"

RPM_NAME = "nomino-1.3.2-1.1.aarch64.rpm"
RPM_HASH = "5f77b7321310ebfb4e55000c1c8f049a1683b13ab41fa4e50f8d5e7c1865e62ae2a8d5573c473f08aef9265d027918ed195b39a165e35ec52998b82c199850da"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-colored \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-encode-unicode \
bundled-rust-crate-heck \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-natord \
bundled-rust-crate-nomino \
bundled-rust-crate-once-cell \
bundled-rust-crate-prettytable-rs \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-term \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
nomino"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
