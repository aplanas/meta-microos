SUMMARY = "Modernized self-contained TeX and LaTeX engine"
DESCRIPTION = "Tectonic is a complete self-contained TeX/LaTeX engine powered by \
XeTeX and TeXLive."
LICENSE = "(Apache-2.0 | MIT) & BSD-3-Clause ) & ( 0BSD | MIT | Apache-2.0 ) & ( Apache-2.0 | BSL-1.0 ) & ( Apache-2.0 | MIT ) & ( Apache-2.0-with-LLVM-exception | Apache-2.0 | MIT ) & ( MIT | Apache-2.0 & BSD-2-Clause ) & ( MIT | Apache-2.0 | Zlib ) & ( MIT | Zlib | Apache-2.0 ) & ( Unlicense | MIT ) & ( Zlib | Apache-2.0 | MIT ) & Apache-2.0 & BSD-2-Clause & BSD-3-Clause & CC0-1.0 & ISC & MIT & WTFPL"

PV = "0.14.1"

RPM_NAME = "tectonic-0.14.1-1.1.aarch64.rpm"
RPM_HASH = "cf51644dbab5a1e02bb8a2c7b91e2d50fc614d11c208bab6587304d6dea9e1afee6e3e685e7e5a485f3d0e43246c8e3fa0513874d081782321a4df8883f3ff2e"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-anyhow \
bundled-rust-crate-app-dirs2 \
bundled-rust-crate-async-priority-channel \
bundled-rust-crate-async-recursion \
bundled-rust-crate-async-trait \
bundled-rust-crate-atomic-take \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-block-buffer \
bundled-rust-crate-bstr \
bundled-rust-crate-btoi \
bundled-rust-crate-byte-unit \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-chrono-tz \
bundled-rust-crate-chrono-tz-build \
bundled-rust-crate-clap \
bundled-rust-crate-clearscreen \
bundled-rust-crate-command-group \
bundled-rust-crate-cpufeatures \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-crypto-common \
bundled-rust-crate-deunicode \
bundled-rust-crate-digest \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-endian-type \
bundled-rust-crate-equivalent \
bundled-rust-crate-error-chain \
bundled-rust-crate-event-listener \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs2 \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-generic-array \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-gix-actor \
bundled-rust-crate-gix-config \
bundled-rust-crate-gix-config-value \
bundled-rust-crate-gix-date \
bundled-rust-crate-gix-features \
bundled-rust-crate-gix-fs \
bundled-rust-crate-gix-glob \
bundled-rust-crate-gix-hash \
bundled-rust-crate-gix-lock \
bundled-rust-crate-gix-object \
bundled-rust-crate-gix-path \
bundled-rust-crate-gix-ref \
bundled-rust-crate-gix-sec \
bundled-rust-crate-gix-tempfile \
bundled-rust-crate-gix-trace \
bundled-rust-crate-gix-utils \
bundled-rust-crate-gix-validate \
bundled-rust-crate-globset \
bundled-rust-crate-globwalk \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-hex \
bundled-rust-crate-home \
bundled-rust-crate-html-escape \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-humansize \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-tls \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-ignore \
bundled-rust-crate-ignore-files \
bundled-rust-crate-indexmap \
bundled-rust-crate-inotify \
bundled-rust-crate-inotify-sys \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-docker \
bundled-rust-crate-is-wsl \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libm \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-md-5 \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-miette \
bundled-rust-crate-miette-derive \
bundled-rust-crate-mime \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-native-tls \
bundled-rust-crate-nibble-vec \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-normalize-path \
bundled-rust-crate-notify \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-open \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-parse-zoneinfo \
bundled-rust-crate-pathdiff \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pest \
bundled-rust-crate-pest-derive \
bundled-rust-crate-pest-generator \
bundled-rust-crate-pest-meta \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pinot \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-project-origins \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-radix-trie \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-sha1-smol \
bundled-rust-crate-sha2 \
bundled-rust-crate-signal-hook-registry \
bundled-rust-crate-siphasher \
bundled-rust-crate-slab \
bundled-rust-crate-slug \
bundled-rust-crate-smallvec \
bundled-rust-crate-socket2 \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-tectonic \
bundled-rust-crate-tectonic-bridge-core \
bundled-rust-crate-tectonic-bridge-flate \
bundled-rust-crate-tectonic-bridge-freetype2 \
bundled-rust-crate-tectonic-bridge-graphite2 \
bundled-rust-crate-tectonic-bridge-harfbuzz \
bundled-rust-crate-tectonic-bridge-icu \
bundled-rust-crate-tectonic-bundles \
bundled-rust-crate-tectonic-cfg-support \
bundled-rust-crate-tectonic-dep-support \
bundled-rust-crate-tectonic-docmodel \
bundled-rust-crate-tectonic-engine-bibtex \
bundled-rust-crate-tectonic-engine-spx2html \
bundled-rust-crate-tectonic-engine-xdvipdfmx \
bundled-rust-crate-tectonic-engine-xetex \
bundled-rust-crate-tectonic-errors \
bundled-rust-crate-tectonic-geturl \
bundled-rust-crate-tectonic-io-base \
bundled-rust-crate-tectonic-pdf-io \
bundled-rust-crate-tectonic-status-base \
bundled-rust-crate-tectonic-xdv \
bundled-rust-crate-tectonic-xetex-layout \
bundled-rust-crate-tempfile \
bundled-rust-crate-tera \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminfo \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-macros \
bundled-rust-crate-tokio-native-tls \
bundled-rust-crate-tokio-stream \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-attributes \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-typenum \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-uncased \
bundled-rust-crate-unic-char-property \
bundled-rust-crate-unic-char-range \
bundled-rust-crate-unic-common \
bundled-rust-crate-unic-segment \
bundled-rust-crate-unic-ucd-segment \
bundled-rust-crate-unic-ucd-version \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-bom \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-url \
bundled-rust-crate-utf8-width \
bundled-rust-crate-vcpkg \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-want \
bundled-rust-crate-watchexec \
bundled-rust-crate-watchexec-events \
bundled-rust-crate-watchexec-filterer-globset \
bundled-rust-crate-watchexec-filterer-ignore \
bundled-rust-crate-watchexec-signals \
bundled-rust-crate-which \
bundled-rust-crate-winnow \
bundled-rust-crate-xdg \
bundled-rust-crate-zip \
tectonic"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgraphite2.so.3 \
libharfbuzz.so.0 \
libicuuc.so.73 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
