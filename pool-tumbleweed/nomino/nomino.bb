SUMMARY = "Batch rename utility for developers"
DESCRIPTION = "nomino is a batch rename utility for developers"
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.1"

RPM_NAME = "nomino-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "ca7b1d59873e057114d70e3d41ce918bce7a0ad4d575be8555f345a717b503ce748a78c637c77a09e15bc96c917e3cf8efce9cc856fd59a4e0ab75766eaf2942"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colored \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-encode-unicode \
bundled-rust-crate-hashbrown \
bundled-rust-crate-indexmap \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-natord \
bundled-rust-crate-nomino \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-prettytable-rs \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-json \
bundled-rust-crate-strsim \
bundled-rust-crate-term \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-width \
bundled-rust-crate-walkdir \
bundled-rust-crate-yaml-rust \
nomino"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
