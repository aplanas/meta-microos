SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs-devel contains development libraries \
required to use the OCaml bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-devel-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "b6739ac00b3bba30f87ff12462dd8ff6d9415166a3d14428abcfa3c32b7152626238cbcadbe3fb27d92795bb93c4fbbe9cb7bd83c2f8e56673844e0ac8fe62c6"

RPROVIDES:${PN} += "ocaml-libguestfs-devel \
ocaml-libguestfs-devel(aarch-64)"

RDEPENDS:${PN} += "ocaml-libguestfs"

inherit rpm
