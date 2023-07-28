SUMMARY = "A fcitx plugin for mlterm"
DESCRIPTION = "A plugin to use the fcitx input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-fcitx-3.9.3-2.1.aarch64.rpm"
RPM_HASH = "e340754bf8b2ee3c1ff5791b53f2cc4d0c35b59fc32343f89218bac0ddced83863cc5175e825df6754941941e4e0ac5239006327c0a966859ddd20f74f7e5d57"

RPROVIDES:${PN} += "libim-fcitx-sdl2.so \
libim-fcitx-wl.so \
libim-fcitx.so \
locale-fcitx-ja;ko;ar;he \
mlterm-fcitx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5GClient.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpobl.so.2"

inherit rpm
