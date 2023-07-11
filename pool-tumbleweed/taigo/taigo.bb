SUMMARY = "A virtual pet for your desktop"
DESCRIPTION = "A virtual pet for your desktop that needs your \
care in raising it."
LICENSE = "GPL-3.0-only"

PV = "0.3"

RPM_NAME = "taigo-0.3-1.17.aarch64.rpm"
RPM_HASH = "127ba3f5691a549759357471992c4bcf3e618a1bfb967ce42392bfe7af7622140ac6a852426272ab2975313ef05f68b6088c410036ec5ed8074e7aa9736ef6bc"

RPROVIDES:${PN} += "taigo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0"

inherit rpm
