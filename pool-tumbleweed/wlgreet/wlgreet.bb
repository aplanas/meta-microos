SUMMARY = "Raw wayland greeter for greetd"
DESCRIPTION = "Raw wayland greeter for greetd, to be run under sway or similar. \
Note that cage is currently not supported due to it lacking wlr-layer-shell-unstable support."
LICENSE = "GPL-3.0-only"

PV = "0.4.1"

RPM_NAME = "wlgreet-0.4.1-2.2.aarch64.rpm"
RPM_HASH = "2a075abd3dbff0959c2477f2f7dab92de386e596df2a39fa84d9a543d6c4e33098ffe863ba33a713215a14a7f90313905cb0d2a79d710a433d6861f9befd5f28"

RPROVIDES:${PN} += "bundled-rust-crate-ab-glyph-rasterizer \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-calloop \
bundled-rust-crate-cfg-if \
bundled-rust-crate-chrono \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-getopts \
bundled-rust-crate-greetd-ipc \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-pipe \
bundled-rust-crate-owned-ttf-parser \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rusttype \
bundled-rust-crate-ryu \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-smallvec \
bundled-rust-crate-smithay-client-toolkit \
bundled-rust-crate-syn \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-time \
bundled-rust-crate-toml \
bundled-rust-crate-ttf-parser \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-unicode-width \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wlgreet \
bundled-rust-crate-xcursor \
bundled-rust-crate-xml-rs \
wlgreet"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
