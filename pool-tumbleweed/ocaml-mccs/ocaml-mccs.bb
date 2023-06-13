SUMMARY = "Stripped-down version of mccs with OCaml bindings"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project."
LICENSE = "LGPL-2.1-only-WITH-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+14"

RPM_NAME = "ocaml-mccs-1.1+14-1.7.aarch64.rpm"
RPM_HASH = "02e0f1426a69d1a28ab8f495c399417e4b754fd2812fe28e9d967791d2284ce48012405db2884399b7a249ff2bf74b09d7728bf6e8918cee9d00e234107a71e8"

RPROVIDES:${PN} += "ocaml-mccs \
ocaml-mccs(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
