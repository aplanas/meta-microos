SUMMARY = "OCaml bindings for libguestfs"
DESCRIPTION = "ocaml-libguestfs-devel contains development libraries \
required to use the OCaml bindings for libguestfs."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "ocaml-libguestfs-devel-1.50.1-3.3.aarch64.rpm"
RPM_HASH = "154e35daec802d01f34096912a842b0f401136595d2679b308b553ea366dfe9859d230a4bf7db19a610f02460ad8720a71b54b8c0c5f522d537b9e9ab166bd30"

RPROVIDES:${PN} += "ocaml-libguestfs-devel"

RDEPENDS:${PN} += "ocaml-libguestfs"

inherit rpm
