SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs contains OCaml bindings for libguestfs. \
 \
This is for toplevel and scripting access only.  To compile OCaml \
programs which use libguestfs you will also need ocaml-libguestfs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "1a28ac1acff50e69ce34dc4b61d31a94d8ccd0976c3583aa9b4458da788568f50a7b9a5d717ea023d0521644f550461adca162e59ffc271c2264c698bf761857"

RPROVIDES:${PN} += "ocaml-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0"

inherit rpm
