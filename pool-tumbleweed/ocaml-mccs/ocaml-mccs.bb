SUMMARY = "Stripped-down version of mccs with OCaml bindings"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+14"

RPM_NAME = "ocaml-mccs-1.1+14-1.8.aarch64.rpm"
RPM_HASH = "cae5f2f0143759431ff062b82e6e88bcc3caf857273a2e20cdc6af2415102922b36e6b3189d78edecf263bd1eac6478fb920f8d9ff0ffdcd01295258934c27bf"

RPROVIDES:${PN} += "ocaml-mccs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
