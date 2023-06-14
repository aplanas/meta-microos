SUMMARY = "Compression and decompression utility for the terminal"
DESCRIPTION = "The 'Obvious Unified Compression Helper' is a CLI tool for \
compressing and decompressing files from and to several formats."
LICENSE = "MIT"

PV = "0.4.1~0"

RPM_NAME = "ouch-0.4.1~0-1.3.aarch64.rpm"
RPM_HASH = "8275b9c96a48bbb5321b78c97d10d66596b9e07c4d0ea4f6121342fce62eca234dc74513894fb360be45acee17cc694e283211f0c0ac8f61b14c38f0cf9b1f02"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-atty \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-byteorder \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip2-sys \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-crc32fast \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-fnv \
bundled-rust-crate-fs-err \
bundled-rust-crate-globset \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-lzma-sys \
bundled-rust-crate-lzzzz \
bundled-rust-crate-memchr \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-ouch \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-remove-dir-all \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-serde \
bundled-rust-crate-snap \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-ubyte \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
bundled-rust-crate-xattr \
bundled-rust-crate-xz2 \
bundled-rust-crate-zip \
bundled-rust-crate-zstd \
bundled-rust-crate-zstd-safe \
bundled-rust-crate-zstd-sys \
ouch"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
