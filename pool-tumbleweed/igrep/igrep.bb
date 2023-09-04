SUMMARY = "Interactive Grep"
DESCRIPTION = "Runs grep in the background, allows interactively pick its results and open selected match in text editor of choice."
LICENSE = "MIT"

PV = "1.2.0~0"

RPM_NAME = "igrep-1.2.0~0-1.1.aarch64.rpm"
RPM_HASH = "73a13b1b195d69450245620ff431e062414e852dcaf4ae39ba6cd0c270a57cbaf66cce157f41df9f96c210e1bff209fc6db7d57bd7d159bc7887e92d707cac37"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-bytecount \
bundled-rust-crate-cassowary \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossterm \
bundled-rust-crate-deranged \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-globset \
bundled-rust-crate-grep \
bundled-rust-crate-grep-cli \
bundled-rust-crate-grep-matcher \
bundled-rust-crate-grep-printer \
bundled-rust-crate-grep-regex \
bundled-rust-crate-grep-searcher \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-igrep \
bundled-rust-crate-indexmap \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-line-wrap \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-once-cell \
bundled-rust-crate-onig \
bundled-rust-crate-onig-sys \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-ratatui \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustversion \
bundled-rust-crate-ryu \
bundled-rust-crate-safemem \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-signal-hook \
bundled-rust-crate-signal-hook-mio \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-yaml-rust \
igrep"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
