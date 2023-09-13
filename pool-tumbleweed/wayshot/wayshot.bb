SUMMARY = "Screenshot tool for wlroots based compositors"
DESCRIPTION = "A screenshot tool for wlroots based compositors implementing zwlr_screencopy_v1"
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & BSD-3-Clause & ISC & MIT & Zlib & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "wayshot-1.3.0-4.1.aarch64.rpm"
RPM_HASH = "e626e6e2b934f07c507e6060e1a2c5a1bbbc2d069a3ceafa7af72134bc85fd8016724304d35d06026cf1ab880b3680ddfc5dfbda2086f8e7a2ce9da9d12a358e"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-crc32fast \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-env-logger \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-hashbrown \
bundled-rust-crate-image \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libwayshot \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-nix \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-rustix \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-wayshot \
wayshot"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
