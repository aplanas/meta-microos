SUMMARY = "GTK UI for Neovim"
DESCRIPTION = "GTK UI for Neovim written in Rust using gtk-rs bindings. With ligatures \
support."
LICENSE = "GPL-3.0-only"

PV = "0.2.0+git.1609586374.c036492"

RPM_NAME = "neovim-gtk-0.2.0+git.1609586374.c036492-6.1.aarch64.rpm"
RPM_HASH = "121684ac114475e5f3765a00249539d0b7da271abd00dc497fd66190591fff861cc1253b1162542a7e09961cb7495cfbaad7a95de5423142e3d4c65ffe537c52"

RPROVIDES:${PN} += "bundled-rust-crate-aho-corasick \
bundled-rust-crate-ansi-term \
bundled-rust-crate-atk \
bundled-rust-crate-atk-sys \
bundled-rust-crate-atty \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-build-version \
bundled-rust-crate-byteorder \
bundled-rust-crate-c2-chacha \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-cfg-if \
bundled-rust-crate-clap \
bundled-rust-crate-dirs \
bundled-rust-crate-dirs-sys \
bundled-rust-crate-env-logger \
bundled-rust-crate-fnv \
bundled-rust-crate-fragile \
bundled-rust-crate-gdk \
bundled-rust-crate-gdk-pixbuf \
bundled-rust-crate-gdk-pixbuf-sys \
bundled-rust-crate-gdk-sys \
bundled-rust-crate-getrandom \
bundled-rust-crate-gio \
bundled-rust-crate-gio-sys \
bundled-rust-crate-glib \
bundled-rust-crate-glib-sys \
bundled-rust-crate-gobject-sys \
bundled-rust-crate-gtk \
bundled-rust-crate-gtk-sys \
bundled-rust-crate-htmlescape \
bundled-rust-crate-humantime \
bundled-rust-crate-itoa \
bundled-rust-crate-lazy-static \
bundled-rust-crate-libc \
bundled-rust-crate-log \
bundled-rust-crate-memchr \
bundled-rust-crate-neovim-lib \
bundled-rust-crate-num-traits \
bundled-rust-crate-nvim-gtk \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-pangocairo \
bundled-rust-crate-pangocairo-sys \
bundled-rust-crate-percent-encoding \
bundled-rust-crate-phf \
bundled-rust-crate-phf-codegen \
bundled-rust-crate-phf-generator \
bundled-rust-crate-phf-shared \
bundled-rust-crate-pkg-config \
bundled-rust-crate-ppv-lite86 \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quick-error \
bundled-rust-crate-quote \
bundled-rust-crate-rand \
bundled-rust-crate-rand-chacha \
bundled-rust-crate-rand-core \
bundled-rust-crate-rand-pcg \
bundled-rust-crate-regex \
bundled-rust-crate-regex-syntax \
bundled-rust-crate-rmp \
bundled-rust-crate-rmpv \
bundled-rust-crate-ryu \
bundled-rust-crate-serde \
bundled-rust-crate-serde-bytes \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-siphasher \
bundled-rust-crate-strsim \
bundled-rust-crate-syn \
bundled-rust-crate-termcolor \
bundled-rust-crate-textwrap \
bundled-rust-crate-thread-local \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-width \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-unix-daemonize \
bundled-rust-crate-unix-socket \
bundled-rust-crate-vec-map \
bundled-rust-crate-whoami \
neovim-gtk"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
