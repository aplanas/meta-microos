SUMMARY = "Wayland Clipboard Utility in Rust"
DESCRIPTION = "A safe Rust crate for working with the Wayland clipboard."
LICENSE = "Apache-2.0 & MIT"

PV = "0.7.0"

RPM_NAME = "wl-clipboard-rs-0.7.0-4.1.aarch64.rpm"
RPM_HASH = "df3d26523dd2f65c467ebc8206e21cf05274e0ee149f058a9449a445ed3eead220e89033493044324381fbb47cb16d0bbdad828033a38432c5a782bd0b6d26b5"

RPROVIDES:${PN} += "bundled-rust-crate-ansi-term \
bundled-rust-crate-anyhow \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytecount \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-derive-new \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-fastrand \
bundled-rust-crate-fixedbitset \
bundled-rust-crate-fnv \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-mime \
bundled-rust-crate-mime-guess \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-pipe \
bundled-rust-crate-petgraph \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-smallvec \
bundled-rust-crate-stderrlog \
bundled-rust-crate-strsim \
bundled-rust-crate-structopt \
bundled-rust-crate-structopt-derive \
bundled-rust-crate-syn \
bundled-rust-crate-tempfile \
bundled-rust-crate-term-size \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-thread-local \
bundled-rust-crate-tree-magic-mini \
bundled-rust-crate-unicase \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-vec-map \
bundled-rust-crate-version-check \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-server \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wl-clipboard-rs \
bundled-rust-crate-wl-clipboard-rs-tools \
bundled-rust-crate-xml-rs \
wl-clipboard-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
