SUMMARY = "Simple popup for using marks in Sway"
DESCRIPTION = "This allows you to use vim-like marks to switch between different \
containers (windows) in sway easily."
LICENSE = "GPL-3.0-only"

PV = "0.3~0"

RPM_NAME = "sway-marker-0.3~0-2.2.aarch64.rpm"
RPM_HASH = "46d9e5ea21f3a259d06a8c0c4c56adda47a2aa5c4bc4448f57cfed741f4b94580bbc7badf30576b7d74a1914fdda07439aefe3507b393f8cbf1e92bf2e8f2186"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-atk \
bundled-rust-crate-atk-sys \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-cfg-expr \
bundled-rust-crate-clap \
bundled-rust-crate-clap-lex \
bundled-rust-crate-field-offset \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-task \
bundled-rust-crate-futures-util \
bundled-rust-crate-gdk \
bundled-rust-crate-gdk-pixbuf \
bundled-rust-crate-gdk-pixbuf-sys \
bundled-rust-crate-gdk-sys \
bundled-rust-crate-gio \
bundled-rust-crate-gio-sys \
bundled-rust-crate-glib \
bundled-rust-crate-glib-macros \
bundled-rust-crate-glib-sys \
bundled-rust-crate-gobject-sys \
bundled-rust-crate-gtk \
bundled-rust-crate-gtk-layer-shell \
bundled-rust-crate-gtk-layer-shell-sys \
bundled-rust-crate-gtk-sys \
bundled-rust-crate-gtk3-macros \
bundled-rust-crate-hashbrown \
bundled-rust-crate-heck \
bundled-rust-crate-indexmap \
bundled-rust-crate-io-lifetimes \
bundled-rust-crate-is-terminal \
bundled-rust-crate-itoa \
bundled-rust-crate-libc \
bundled-rust-crate-linux-raw-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-memoffset \
bundled-rust-crate-nom8 \
bundled-rust-crate-once-cell \
bundled-rust-crate-os-str-bytes \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-pest \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-rustc-version \
bundled-rust-crate-rustix \
bundled-rust-crate-ryu \
bundled-rust-crate-semver \
bundled-rust-crate-semver-parser \
bundled-rust-crate-serde \
bundled-rust-crate-serde-derive \
bundled-rust-crate-serde-json \
bundled-rust-crate-slab \
bundled-rust-crate-smallvec \
bundled-rust-crate-strsim \
bundled-rust-crate-sway-marker \
bundled-rust-crate-swayipc \
bundled-rust-crate-swayipc-types \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-termcolor \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-toml \
bundled-rust-crate-toml-datetime \
bundled-rust-crate-toml-edit \
bundled-rust-crate-ucd-trie \
bundled-rust-crate-unicode-ident \
bundled-rust-crate-version-check \
bundled-rust-crate-version-compare \
sway-marker"

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
libgtk-layer-shell.so.0 \
libpango-1.0.so.0"

inherit rpm
