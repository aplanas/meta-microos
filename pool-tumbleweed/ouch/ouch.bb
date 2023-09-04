SUMMARY = "Compression and decompression utility for the terminal"
DESCRIPTION = "The 'Obvious Unified Compression Helper' is a CLI tool for \
compressing and decompressing files from and to several formats."
LICENSE = "MIT"

PV = "0.4.2~0"

RPM_NAME = "ouch-0.4.2~0-1.1.aarch64.rpm"
RPM_HASH = "ed212eab287e3b67170ba9dc4b68c2b8bf2aa463775a092bd2e7399a364db0793e58f89a9b38c6c32b76b66072c4e0d631573bfcf87dc48e8ad3eaa5edcaecf9"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-aho-corasick \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-byteorder \
bundled-rust-crate-bytes \
bundled-rust-crate-bzip2 \
bundled-rust-crate-bzip2-sys \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-clap-mangen \
bundled-rust-crate-colorchoice \
bundled-rust-crate-core-affinity \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-deranged \
bundled-rust-crate-either \
bundled-rust-crate-fastrand \
bundled-rust-crate-filetime \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-fnv \
bundled-rust-crate-fs-err \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-sink \
bundled-rust-crate-getrandom \
bundled-rust-crate-globset \
bundled-rust-crate-gzp \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-is-terminal \
bundled-rust-crate-jobserver \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libz-sys \
bundled-rust-crate-linked-hash-map \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lzma-sys \
bundled-rust-crate-lzzzz \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nanorand \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-ouch \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-automata \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-roff \
bundled-rust-crate-rustix \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-snap \
bundled-rust-crate-spin \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-tar \
bundled-rust-crate-tempfile \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-ubyte \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-vcpkg \
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
