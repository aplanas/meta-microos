SUMMARY = "Stripped-down version of mccs with OCaml bindings"
DESCRIPTION = "mccs (which stands for Multi Criteria CUDF Solver) is a CUDF problem solver \
developed at UNS during the European MANCOOSI project."
LICENSE = "LGPL-2.1-only-with-OCaml-LGPL-linking-exception & BSD-3-Clause & GPL-3.0-only"

PV = "1.1+16"

RPM_NAME = "ocaml-mccs-1.1+16-1.1.aarch64.rpm"
RPM_HASH = "b690403be426d571d04fa54dd403778d68f40d033c6b0eb547e67f706dace2e00f1ae8c434bf18e94f78bd4f158b2cda8318da80619f19cd149731799f34d198"

RPROVIDES:${PN} += "ocaml-mccs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
