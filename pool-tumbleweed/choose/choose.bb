SUMMARY = "A human-friendly and fast alternative to cut and (sometimes) awk"
DESCRIPTION = "A human-friendly and fast alternative to cut and (sometimes) awk."
LICENSE = "MIT"

PV = "1.3.4~0"

RPM_NAME = "choose-1.3.4~0-1.5.aarch64.rpm"
RPM_HASH = "02510f23f12eb59bc6cfcdcf6f9ffb302cf70a41a58fa1d6522eb45289c9d81a7d2ff40181c680e4d72fc8fb9c00e745b3a3f94b9ab008af691773fc2885e7f7"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-backslash \
bundled-rust-crate-bitflags \
bundled-rust-crate-choose \
bundled-rust-crate-clap \
bundled-rust-crate-heck \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-memchr \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
choose"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
