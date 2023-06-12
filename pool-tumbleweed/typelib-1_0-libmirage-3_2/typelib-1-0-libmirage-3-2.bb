SUMMARY = "Introspection bindings for the libmirage CD-ROM image access library"
DESCRIPTION = "libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package provides the GObject Introspection bindings for libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "typelib-1_0-libmirage-3_2-3.2.6-1.8.aarch64.rpm"
RPM_HASH = "68407d6c376101cb9e3e9dc38e37d5563a905d23776f8a22beaf9b1a24d41f3a3b8fb950cbfcf5f2a27aeaaec73659734a4333cdc5efe8b2398000689144ba17"

RPROVIDES:${PN} += "typelib(Mirage) \
typelib-1_0-libmirage-3_2 \
typelib-1_0-libmirage-3_2(aarch-64)"
RDEPENDS:${PN} += "libmirage.so.11()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gio)"

inherit rpm
