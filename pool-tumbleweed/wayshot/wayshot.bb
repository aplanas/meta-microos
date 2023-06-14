SUMMARY = "Screenshot tool for wlroots based compositors"
DESCRIPTION = "A screenshot tool for wlroots based compositors implementing zwlr_screencopy_v1"
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & BSD-3-Clause & ISC & MIT & Zlib & BSD-2-Clause"

PV = "1.2.2"

RPM_NAME = "wayshot-1.2.2-1.2.aarch64.rpm"
RPM_HASH = "15883141981891209f28335a9432c956fa12e286b044245f97dd8dfb3b5869840c31d33e6308e6fade4ce86cc31d31bda460ee942e47db3612a0d0410db5ba9b"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-crc32fast \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-env-logger \
bundled-rust-crate-fastrand \
bundled-rust-crate-flate2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-image \
bundled-rust-crate-indexmap \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-remove-dir-all \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wayshot \
bundled-rust-crate-xml-rs \
wayshot"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
