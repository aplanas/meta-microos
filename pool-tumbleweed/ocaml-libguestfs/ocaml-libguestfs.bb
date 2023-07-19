SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs contains OCaml bindings for libguestfs. \
 \
This is for toplevel and scripting access only.  To compile OCaml \
programs which use libguestfs you will also need ocaml-libguestfs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "f2c98c32a2aeaf938be886d8ff86e35bd9f50d5031ef2bc7a3c80c25f9da6feac80b47f5c38f83c9dca829aac678a28a48ed3d78bd23c9e83a0502e544d9cce1"

RPROVIDES:${PN} += "ocaml-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0"

inherit rpm
