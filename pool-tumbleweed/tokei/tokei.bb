SUMMARY = "Code statistics commandline tool"
DESCRIPTION = "Shows the number of files, total lines within those files and code, comments and blanks grouped by language."
LICENSE = "(Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & BSD-3-Clause & MIT & MPL-2.0 & (Apache-2.0 | MIT)"

PV = "12.1.2+git106"

RPM_NAME = "tokei-12.1.2+git106-2.2.aarch64.rpm"
RPM_HASH = "4d668f14a0dad754b907641fa74ad7db51734cf73b328b025471f26902b8c1a593b191d07286c24613f198b03d4ee20c9f477f1bc816073c29bbb717e6039912"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-arbitrary \
bundled-rust-crate-arrayvec \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-bytecount \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-tz \
bundled-rust-crate-chrono-tz-build \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-colored \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-dashmap \
bundled-rust-crate-derive-arbitrary \
bundled-rust-crate-deunicode \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-encoding-rs-io \
bundled-rust-crate-env-logger \
bundled-rust-crate-fnv \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-globset \
bundled-rust-crate-globwalk \
bundled-rust-crate-grep-matcher \
bundled-rust-crate-grep-searcher \
bundled-rust-crate-hashbrown \
bundled-rust-crate-humansize \
bundled-rust-crate-humantime \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-ignore \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-format \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-parse-zoneinfo \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-sha1 \
bundled-rust-crate-siphasher \
bundled-rust-crate-slug \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tera \
bundled-rust-crate-term-size \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tokei \
bundled-rust-crate-toml \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-uncased \
bundled-rust-crate-unic-char-property \
bundled-rust-crate-unic-char-range \
bundled-rust-crate-unic-common \
bundled-rust-crate-unic-segment \
bundled-rust-crate-unic-ucd-segment \
bundled-rust-crate-unic-ucd-version \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
tokei"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
