SUMMARY = "A cat(1) clone with syntax highlighting and Git integration"
DESCRIPTION = "A cat(1) clone which supports syntax highlighting for a large number of \
programming and markup languages. It has git integration and automatic paging."
LICENSE = "Apache-2.0 | MIT"

PV = "0.23.0"

RPM_NAME = "bat-0.23.0-1.2.aarch64.rpm"
RPM_HASH = "d6fea97f767adfbd94f7667ede290578a100135dfc4bee7f0bd6dbff1c3b9c3eda96756a367ecca481aed9f070a7fe0fdcc7a7a561b0daa1be6e1c4de7c32a93"

RPROVIDES:${PN} += "bat \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-colours \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-base64 \
bundled-rust-crate-bat \
bundled-rust-crate-bincode \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-bugreport \
bundled-rust-crate-bytemuck \
bundled-rust-crate-bytesize \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clircle \
bundled-rust-crate-console \
bundled-rust-crate-content-inspector \
bundled-rust-crate-crc32fast \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-encoding \
bundled-rust-crate-encoding-index-japanese \
bundled-rust-crate-encoding-index-korean \
bundled-rust-crate-encoding-index-simpchinese \
bundled-rust-crate-encoding-index-singlebyte \
bundled-rust-crate-encoding-index-tests \
bundled-rust-crate-encoding-index-tradchinese \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-git-version \
bundled-rust-crate-git-version-macro \
bundled-rust-crate-git2 \
bundled-rust-crate-globset \
bundled-rust-crate-grep-cli \
bundled-rust-crate-hashbrown \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libgit2-sys \
bundled-rust-crate-libz-sys \
bundled-rust-crate-line-wrap \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nu-ansi-term \
bundled-rust-crate-once-cell \
bundled-rust-crate-onig \
bundled-rust-crate-onig-sys \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-path-abs \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pkg-config \
bundled-rust-crate-plist \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rgb \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-safemem \
bundled-rust-crate-same-file \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-yaml \
bundled-rust-crate-shell-escape \
bundled-rust-crate-shell-words \
bundled-rust-crate-std-prelude \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-syntect \
bundled-rust-crate-sys-info \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-walkdir \
bundled-rust-crate-wild \
bundled-rust-crate-yaml-rust"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
