SUMMARY = "Intuitive find & replace CLI"
DESCRIPTION = "sd uses regex syntax that you already know from JavaScript and Python. \
Forget about dealing with quirks of sed or awk - get productive immediately."
LICENSE = "(Apache-2.0 | MIT) & (MIT | Unlicense) & BSD-3-Clause & MIT & (MIT | Unlicense)"

PV = "0.7.6+g33"

RPM_NAME = "sd-0.7.6+g33-3.1.aarch64.rpm"
RPM_HASH = "6c3897732c567e2d08779b7ff992e2b8e125e9831ed810c9b4c680818e77088caf4e964d917e66205b29b1e4b07a57fec2d2a9f1bafb2caf601f7c0e37b5921f"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bstr \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-either \
bundled-rust-crate-fastrand \
bundled-rust-crate-fnv \
bundled-rust-crate-globset \
bundled-rust-crate-globwalk \
bundled-rust-crate-heck \
bundled-rust-crate-ignore \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-man \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap \
bundled-rust-crate-memoffset \
bundled-rust-crate-num-cpus \
bundled-rust-crate-once-cell \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-remove-dir-all \
bundled-rust-crate-roff \
bundled-rust-crate-same-file \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sd \
bundled-rust-crate-serde \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-unescape \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-walkdir \
sd"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
