SUMMARY = "GTK UI for Neovim"
DESCRIPTION = "GTK UI for Neovim written in Rust using gtk-rs bindings. With ligatures \
support."
LICENSE = "GPL-3.0-only"

PV = "0.2.0+git.1609586374.c036492"

RPM_NAME = "neovim-gtk-0.2.0+git.1609586374.c036492-5.3.aarch64.rpm"
RPM_HASH = "2b80713f2e0bf6bc051688e805bc64f032f009030b389a5ce6b32651908586ccec6d4199b8e7a88765194850d816a0916590b36ccc1161d641cd609cd3c75184"

RPROVIDES:${PN} += "neovim-gtk"

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
