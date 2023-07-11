SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs contains OCaml bindings for libguestfs. \
 \
This is for toplevel and scripting access only.  To compile OCaml \
programs which use libguestfs you will also need ocaml-libguestfs-devel."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "28eefc2f8c994be3b5a7020e3ee85d3f9110d6af34305984677c4620bd7b2be3ee2561ea2a12ad555ef815882d40baf45e76e669880412a19eddafd5a0daacfa"

RPROVIDES:${PN} += "ocaml-libguestfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libguestfs \
libguestfs.so.0"

inherit rpm
