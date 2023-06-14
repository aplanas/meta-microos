SUMMARY = "A modern Volume Mixer for PulseAudio"
DESCRIPTION = "A hello world with a number of the day printer."
LICENSE = "GPL-3.0-only"

PV = "1.2.1~git0.f97f06a"

RPM_NAME = "myxer-1.2.1~git0.f97f06a-2.2.aarch64.rpm"
RPM_HASH = "d4cd4da468944e4841790bf919e44350572515100a38ff2f3ad4de2f737d617e2dc0805779368f034b190bd1e30511ba60f077f67d4122856c93a8948da80f83"

RPROVIDES:${PN} += "bundled-rust-crate-anyhow \
bundled-rust-crate-atk \
bundled-rust-crate-atk-sys \
bundled-rust-crate-autocfg \
bundled-rust-crate-bitflags \
bundled-rust-crate-cairo-rs \
bundled-rust-crate-cairo-sys-rs \
bundled-rust-crate-colorsys \
bundled-rust-crate-either \
bundled-rust-crate-futures \
bundled-rust-crate-futures-channel \
bundled-rust-crate-futures-core \
bundled-rust-crate-futures-executor \
bundled-rust-crate-futures-io \
bundled-rust-crate-futures-macro \
bundled-rust-crate-futures-sink \
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
bundled-rust-crate-gtk-sys \
bundled-rust-crate-heck \
bundled-rust-crate-itertools \
bundled-rust-crate-libc \
bundled-rust-crate-libpulse-binding \
bundled-rust-crate-libpulse-sys \
bundled-rust-crate-memchr \
bundled-rust-crate-myxer \
bundled-rust-crate-num-derive \
bundled-rust-crate-num-traits \
bundled-rust-crate-once-cell \
bundled-rust-crate-pango \
bundled-rust-crate-pango-sys \
bundled-rust-crate-pin-project-lite \
bundled-rust-crate-pin-utils \
bundled-rust-crate-pkg-config \
bundled-rust-crate-proc-macro-crate \
bundled-rust-crate-proc-macro-error \
bundled-rust-crate-proc-macro-error-attr \
bundled-rust-crate-proc-macro-hack \
bundled-rust-crate-proc-macro-nested \
bundled-rust-crate-proc-macro2 \
bundled-rust-crate-quote \
bundled-rust-crate-serde \
bundled-rust-crate-slab \
bundled-rust-crate-slice-as-array \
bundled-rust-crate-strum \
bundled-rust-crate-strum-macros \
bundled-rust-crate-syn \
bundled-rust-crate-system-deps \
bundled-rust-crate-thiserror \
bundled-rust-crate-thiserror-impl \
bundled-rust-crate-toml \
bundled-rust-crate-unicode-segmentation \
bundled-rust-crate-unicode-xid \
bundled-rust-crate-version-check \
bundled-rust-crate-version-compare \
myxer"

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
libpango-1.0.so.0 \
libpulse.so.0"

inherit rpm
