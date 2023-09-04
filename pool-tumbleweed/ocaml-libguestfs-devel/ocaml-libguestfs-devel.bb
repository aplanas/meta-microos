SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs-devel contains development libraries \
required to use the OCaml bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-devel-1.50.1-4.2.aarch64.rpm"
RPM_HASH = "c0e56ea07d61de1d0c3c53751da1f5baae0070e455aee08c2c739223de7258f48bb2f0e3651cb8d4c211ef24913dbadc38a82c6f65118b5a2f534a9a7672e671"

RPROVIDES:${PN} += "ocaml-libguestfs-devel"

RDEPENDS:${PN} += "ocaml-libguestfs"

inherit rpm
