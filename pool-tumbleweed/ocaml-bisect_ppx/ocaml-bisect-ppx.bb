SUMMARY = "Code coverage for OCaml and Reason"
DESCRIPTION = "Bisect_ppx is a code coverage tool for OCaml and Reason. It helps you test thoroughly by showing what's not tested."
LICENSE = "GPL-2.0-only"

PV = "2.8.2"

RPM_NAME = "ocaml-bisect_ppx-2.8.2-2.2.aarch64.rpm"
RPM_HASH = "dd3c596996c21544a3c1085777f0038e37762d7f686b4c744f9cab2ec6551df7d53e9163720e54baa12bbcd21ee650af9dd6567b88f007e72726eb2d06e5a6f0"

RPROVIDES:${PN} += "ocaml-bisect-ppx"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
