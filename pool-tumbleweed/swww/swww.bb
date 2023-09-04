SUMMARY = "Wallpaper daemon for Wayland"
DESCRIPTION = "swww is a wallpaper daemon for Wayland that is controlled \
at runtime. It uses LZ4 compression for frame animations \
for animated wallpapers."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-0.8.1-2.1.aarch64.rpm"
RPM_HASH = "b2609ffd5e96b85bdc06c76d5e3fd2b65d01d2ef433c3d1967fa2aa78c3c695d82db15a39b1a003a98ebb8348a52c17e0163293b48318a73b66ad8aaf158f39c"

RPROVIDES:${PN} += "bundled-rust-crate-adler \
bundled-rust-crate-ahash \
bundled-rust-crate-anstream \
bundled-rust-crate-anstyle \
bundled-rust-crate-anstyle-parse \
bundled-rust-crate-anstyle-query \
bundled-rust-crate-autocfg \
bundled-rust-crate-bit-field \
bundled-rust-crate-bitflags \
bundled-rust-crate-bitvec \
bundled-rust-crate-bytecheck \
bundled-rust-crate-bytecheck-derive \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-clap-builder \
bundled-rust-crate-clap-complete \
bundled-rust-crate-clap-derive \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-colorchoice \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-either \
bundled-rust-crate-exr \
bundled-rust-crate-fast-image-resize \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-flume \
bundled-rust-crate-funty \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-sink \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-image \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-jobserver \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-keyframe \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-libm \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-lzzzz \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mint \
bundled-rust-crate-nanorand \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-threads \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-ptr-meta \
bundled-rust-crate-ptr-meta-derive \
bundled-rust-crate-qoi \
bundled-rust-crate-quick-xml \
bundled-rust-crate-quote \
bundled-rust-crate-radium \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rend \
bundled-rust-crate-rkyv \
bundled-rust-crate-rkyv-derive \
bundled-rust-crate-rustix \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-scopeguard \
bundled-rust-crate-sd-notify \
bundled-rust-crate-seahash \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-simdutf8 \
bundled-rust-crate-simplelog \
bundled-rust-crate-smallvec \
bundled-rust-crate-smithay-client-toolkit \
bundled-rust-crate-spin \
bundled-rust-crate-static-assertions \
bundled-rust-crate-strsim \
bundled-rust-crate-swww \
bundled-rust-crate-swww-daemon \
bundled-rust-crate-syn \
bundled-rust-crate-tap \
bundled-rust-crate-termcolor \
bundled-rust-crate-terminal-size \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-tiff \
bundled-rust-crate-time \
bundled-rust-crate-time-core \
bundled-rust-crate-time-macros \
bundled-rust-crate-tinyvec \
bundled-rust-crate-tinyvec-macros \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-utf8parse \
bundled-rust-crate-utils \
bundled-rust-crate-uuid \
bundled-rust-crate-version-check \
bundled-rust-crate-wayland-backend \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-protocols-wlr \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-weezl \
bundled-rust-crate-wyz \
bundled-rust-crate-xcursor \
bundled-rust-crate-zune-inflate \
swww"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
