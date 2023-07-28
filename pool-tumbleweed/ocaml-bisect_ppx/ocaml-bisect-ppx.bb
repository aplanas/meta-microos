SUMMARY = "Code coverage for OCaml and Reason"
DESCRIPTION = "Bisect_ppx is a code coverage tool for OCaml and Reason. It helps you test thoroughly by showing what's not tested."
LICENSE = "GPL-2.0-only"

PV = "2.8.2"

RPM_NAME = "ocaml-bisect_ppx-2.8.2-2.3.aarch64.rpm"
RPM_HASH = "bceb3fe58fae8b6e95487a5d644215efbf422a16eaf1a991352abf6e5f71749784e8eda5b7347f798b15a107c0ba5ebdeef58d00a657a4c3e44e03faaec14f4a"

RPROVIDES:${PN} += "ocaml-bisect-ppx"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6"

inherit rpm
