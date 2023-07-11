SUMMARY = "stl-thumb Libraries"
DESCRIPTION = "stl-thumb Libraries"
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "libstl-thumb-0.5.0~0-3.2.aarch64.rpm"
RPM_HASH = "7665d4d8233fe19d83dc47627250b8bee02c1e56e9999d36c2d0cd6bad4a4d18a382380ad33ba7b052d24d9d7764ad8623f3e49de8e19146e486d6bc18ae26d5"

RPROVIDES:${PN} += "bundled-rust-crate-addr2line \
bundled-rust-crate-adler \
bundled-rust-crate-approx \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-backtrace \
bundled-rust-crate-bit-field \
bundled-rust-crate-bitflags \
bundled-rust-crate-bytemuck \
bundled-rust-crate-byteorder \
bundled-rust-crate-calloop \
bundled-rust-crate-cbindgen \
bundled-rust-crate-cc \
bundled-rust-crate-cfg-if \
bundled-rust-crate-cgmath \
bundled-rust-crate-chrono \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-color-quant \
bundled-rust-crate-crc32fast \
bundled-rust-crate-crossbeam-channel \
bundled-rust-crate-crossbeam-deque \
bundled-rust-crate-crossbeam-epoch \
bundled-rust-crate-crossbeam-utils \
bundled-rust-crate-cty \
bundled-rust-crate-dlib \
bundled-rust-crate-downcast-rs \
bundled-rust-crate-either \
bundled-rust-crate-exr \
bundled-rust-crate-fastrand \
bundled-rust-crate-fdeflate \
bundled-rust-crate-flate2 \
bundled-rust-crate-float-cmp \
bundled-rust-crate-flume \
bundled-rust-crate-fnv \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-sink \
bundled-rust-crate-getrandom \
bundled-rust-crate-gif \
bundled-rust-crate-gimli \
bundled-rust-crate-gl-generator \
bundled-rust-crate-glium \
bundled-rust-crate-glutin \
bundled-rust-crate-glutin-egl-sys \
bundled-rust-crate-glutin-glx-sys \
bundled-rust-crate-half \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-iana-time-zone \
bundled-rust-crate-image \
bundled-rust-crate-indexmap \
bundled-rust-crate-instant \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-itoa \
bundled-rust-crate-jpeg-decoder \
bundled-rust-crate-khronos-api \
bundled-rust-crate-lazy-static \
bundled-rust-crate-lebe \
bundled-rust-crate-libc \
bundled-rust-crate-libloading \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-lock-api \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-memmap2 \
bundled-rust-crate-memoffset \
bundled-rust-crate-minimal-lexical \
bundled-rust-crate-miniz-oxide \
bundled-rust-crate-mint \
bundled-rust-crate-mio \
bundled-rust-crate-nanorand \
bundled-rust-crate-nix \
bundled-rust-crate-nom \
bundled-rust-crate-num-cpus \
bundled-rust-crate-num-integer \
bundled-rust-crate-num-rational \
bundled-rust-crate-num-traits \
bundled-rust-crate-object \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-osmesa-sys \
bundled-rust-crate-parking-lot \
bundled-rust-crate-parking-lot-core \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-pin-project \
bundled-rust-crate-pin-project-internal \
bundled-rust-crate-pkg-config \
bundled-rust-crate-png \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-qoi \
bundled-rust-crate-quote \
bundled-rust-crate-raw-window-handle \
bundled-rust-crate-rayon \
bundled-rust-crate-rayon-core \
bundled-rust-crate-rustc-demangle \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-scoped-tls \
bundled-rust-crate-scopeguard \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-shared-library \
bundled-rust-crate-simd-adler32 \
bundled-rust-crate-smallvec \
bundled-rust-crate-smithay-client-toolkit \
bundled-rust-crate-spin \
bundled-rust-crate-stderrlog \
bundled-rust-crate-stl-io \
bundled-rust-crate-stl-thumb \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-takeable-option \
bundled-rust-crate-tempfile \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thread-local \
bundled-rust-crate-tiff \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-wayland-client \
bundled-rust-crate-wayland-commons \
bundled-rust-crate-wayland-cursor \
bundled-rust-crate-wayland-egl \
bundled-rust-crate-wayland-protocols \
bundled-rust-crate-wayland-scanner \
bundled-rust-crate-wayland-sys \
bundled-rust-crate-weezl \
bundled-rust-crate-winit \
bundled-rust-crate-x11-dl \
bundled-rust-crate-xcursor \
bundled-rust-crate-xml-rs \
bundled-rust-crate-zune-inflate \
libstl-thumb \
libstl-thumb.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
