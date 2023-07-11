SUMMARY = "Julia installer and version multiplexer"
DESCRIPTION = "A cross-platform installer for the Julia programming language. \
 \
The installer also bundles a full Julia version manager called juliaup. \
One can use juliaup to install specific Julia versions, it alerts users \
when new Julia versions are released and provides a convenient Julia \
release channel abstraction."
LICENSE = "(0BSD | MIT | Apache-2.0) & Apache-2.0 & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | ISC | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & (Apache-2.0 | MIT | Zlib) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & ISC & MIT & MPL-2.0 & MIT"

PV = "1.11.0"

RPM_NAME = "juliaup-1.11.0-1.1.aarch64.rpm"
RPM_HASH = "d46b5f98dc597038ade7e02299edb2a7054e9b0971ff1452f6b70802b5ed056e63d72624e1e804d5249d21a5424c0cabe66160d07cd029f06c3d98c016da0547"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-anyhow \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-base64 \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-built \
bundled-rust-crate-bytes \
bundled-rust-crate-cargo-lock \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-cli-table \
bundled-rust-crate-cli-table-derive \
bundled-rust-crate-cluFlock \
bundled-rust-crate-colorchoice \
bundled-rust-crate-console \
bundled-rust-crate-crc32fast \
bundled-rust-crate-csv \
bundled-rust-crate-csv-core \
bundled-rust-crate-ctrlc \
bundled-rust-crate-dialoguer \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-dunce \
bundled-rust-crate-either \
bundled-rust-crate-encoding-rs \
bundled-rust-crate-env-logger \
bundled-rust-crate-env-proxy \
bundled-rust-crate-equivalent \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-foreign-types \
bundled-rust-crate-foreign-types-shared \
bundled-rust-crate-form-urlencoded \
bundled-rust-crate-fs-extra \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-sink \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-getrandom \
bundled-rust-crate-gimli \
bundled-rust-crate-h2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-http \
bundled-rust-crate-http-body \
bundled-rust-crate-httparse \
bundled-rust-crate-httpdate \
bundled-rust-crate-human-panic \
bundled-rust-crate-humantime \
bundled-rust-crate-hyper \
bundled-rust-crate-hyper-rustls \
bundled-rust-crate-hyper-tls \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-idna \
bundled-rust-crate-indexmap \
bundled-rust-crate-indicatif \
bundled-rust-crate-indoc \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-ipnet \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itertools \
bundled-rust-crate-itoa \
bundled-rust-crate-juliaup \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mime \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mio \
bundled-rust-crate-native-tls \
bundled-rust-crate-nix \
bundled-rust-crate-normpath \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-traits \
bundled-rust-crate-number-prefix \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-openssl \
bundled-rust-crate-openssl-macros \
bundled-rust-crate-openssl-probe \
bundled-rust-crate-openssl-sys \
bundled-rust-crate-option-ext \
bundled-rust-crate-os-info \
bundled-rust-crate-path-absolutize \
bundled-rust-crate-path-dedot \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-portable-atomic \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-reqwest \
bundled-rust-crate-ring \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-rustls \
bundled-rust-crate-rustls-native-certs \
bundled-rust-crate-rustls-pemfile \
bundled-rust-crate-rustls-webpki \
bundled-rust-crate-ryu \
bundled-rust-crate-sct \
bundled-rust-crate-semver \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-serde-spanned \
bundled-rust-crate-serde-urlencoded \
bundled-rust-crate-shell-words \
bundled-rust-crate-shellexpand \
bundled-rust-crate-slab \
bundled-rust-crate-socket2 \
bundled-rust-crate-spin \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-tokio \
bundled-rust-crate-tokio-native-tls \
bundled-rust-crate-tokio-rustls \
bundled-rust-crate-tokio-socks \
bundled-rust-crate-tokio-util \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-tower-service \
bundled-rust-crate-tracing \
bundled-rust-crate-tracing-core \
bundled-rust-crate-try-lock \
bundled-rust-crate-unicode-bidi \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-normalization \
bundled-rust-crate-unicode-width \
bundled-rust-crate-untrusted \
bundled-rust-crate-url \
bundled-rust-crate-utf8parse \
bundled-rust-crate-uuid \
bundled-rust-crate-want \
bundled-rust-crate-winnow \
bundled-rust-crate-xattr \
bundled-rust-crate-zeroize \
juliaup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
