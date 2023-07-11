SUMMARY = "A fcitx plugin for mlterm"
DESCRIPTION = "A plugin to use the fcitx input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.3"

RPM_NAME = "mlterm-fcitx-3.9.3-1.1.aarch64.rpm"
RPM_HASH = "8787aa72abbe52154a12ff22360df41c47597575c3f1cd022ed490b152e905441e7a932ae6cb06f95e15ee4a758c7fcc9e72dd1e3e6a4c5df78e9b8c8e3edbdd"

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
