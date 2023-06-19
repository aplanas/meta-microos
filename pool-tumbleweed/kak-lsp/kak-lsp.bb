SUMMARY = "Language Server Protocol client for Kakoune"
DESCRIPTION = "kak-lsp is a Language Server Protocol client for Kakoune written in Rust."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | BSL-1.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | MPL-2.0) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & MIT & Zlib & Unlicense"

PV = "14.2.0"

RPM_NAME = "kak-lsp-14.2.0-1.2.aarch64.rpm"
RPM_HASH = "235d2debfa260f777789981624a08bf6a3859c9b52e1b0d44e79c51fb1158e02de9c89e2227bcaaad3d1ce4401ef58f5fd5468ae6b53acc46ba14869497da506"

RPROVIDES:${PN} += "bundled-rust-crate-adler32 \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-arc-swap \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-boxfnonce \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-daemonize \
bundled-rust-crate-diffs \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-next \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dirs-sys-next \
bundled-rust-crate-either \
bundled-rust-crate-enum-primitive \
bundled-rust-crate-filetime \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs4 \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getopts \
bundled-rust-crate-getrandom \
bundled-rust-crate-glob \
bundled-rust-crate-hashbrown \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-indoc \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-jsonrpc-core \
bundled-rust-crate-kak-lsp \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libflate \
bundled-rust-crate-libflate-lz77 \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-lsp-types \
bundled-rust-crate-memchr \
bundled-rust-crate-mio \
bundled-rust-crate-notify \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-pulldown-cmark \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rle-decode-fast \
bundled-rust-crate-ropey \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-repr \
bundled-rust-crate-slab \
bundled-rust-crate-slog \
bundled-rust-crate-slog-async \
bundled-rust-crate-slog-kvfilter \
bundled-rust-crate-slog-scope \
bundled-rust-crate-slog-stdlog \
bundled-rust-crate-slog-term \
bundled-rust-crate-sloggers \
bundled-rust-crate-smallvec \
bundled-rust-crate-str-indices \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-take-mut \
bundled-rust-crate-term \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-toml \
bundled-rust-crate-trackable \
bundled-rust-crate-trackable-derive \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unindent \
bundled-rust-crate-url \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-whoami \
kak-lsp"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
