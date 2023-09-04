SUMMARY = "Implementation of the Language Server Protocol for LaTeX"
DESCRIPTION = "Cross-platform implementation of the Language Server Protocol providing rich cross-editing support for the LaTeX typesetting system. \
The server may be used with any editor that implements the Language Server Protocol."
LICENSE = "( 0BSD | MIT | Apache-2.0 ) & ( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | MIT ) & ( Apache-2.0 | Apache-2.0 | MIT ) & ( CC0-1.0 | Artistic-2.0 ) & ( MIT | Apache-2.0 | Zlib ) & ( MIT | Zlib | Apache-2.0 ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-3-Clause & GPL-3.0 & GPL-3.0+ & ISC & MIT & MPL-2.0 & MPL-2.0+ & GPL-3.0"

PV = "5.9.2"

RPM_NAME = "texlab-5.9.2-1.1.aarch64.rpm"
RPM_HASH = "730917c89a428aa9620b9125bf7d319afde57b6a51c2597f7427b434fe25c5c970032fd7a2c1509a105182d6e8028b3b784087ee9cff37386a0b1b50dbeb4413"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-base-db \
bundled-rust-crate-beef \
bundled-rust-crate-bibtex-utils \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-citeproc \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colorchoice \
bundled-rust-crate-commands \
bundled-rust-crate-completion-data \
bundled-rust-crate-countme \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-definition \
bundled-rust-crate-diagnostics \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-distro \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-fastrand \
bundled-rust-crate-fern \
bundled-rust-crate-file-id \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-folding \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fuzzy-matcher \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hover \
bundled-rust-crate-human-name \
bundled-rust-crate-idna \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-is-terminal \
bundled-rust-crate-isocountry \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-joinery \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-logos \
bundled-rust-crate-logos-codegen \
bundled-rust-crate-logos-derive \
bundled-rust-crate-lsp-server \
bundled-rust-crate-lsp-types \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-notify \
bundled-rust-crate-notify-debouncer-full \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-option-ext \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-parser \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-references \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rowan \
bundled-rust-crate-rustc-hash \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-regex \
bundled-rust-crate-serde-repr \
bundled-rust-crate-siphasher \
bundled-rust-crate-smallstr \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-symbols \
bundled-rust-crate-syn \
bundled-rust-crate-syntax \
bundled-rust-crate-tempfile \
bundled-rust-crate-texlab \
bundled-rust-crate-text-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-threadpool \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-titlecase \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-case-mapping \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unidecode \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-walkdir \
texlab"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
