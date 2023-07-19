SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs-devel contains development libraries \
required to use the OCaml bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-devel-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "51e3030758637798efc652b62288edae55732638c564fbf5edb36b5eed455a50cfc61508bcd0f4b2f6b0b276e685bbd864a08e8c5e5a7664233e456cecc223f9"

RPROVIDES:${PN} += "ocaml-libguestfs-devel"

RDEPENDS:${PN} += "ocaml-libguestfs"

inherit rpm
