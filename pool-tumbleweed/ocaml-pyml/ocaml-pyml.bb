SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "20220905"

RPM_NAME = "ocaml-pyml-20220905-1.5.aarch64.rpm"
RPM_HASH = "b3cef4d1d0cff86a6c6c1a4ad6bd0bdce7ac91bc89182b4961144cd0bd3d798454dc7e6dc19f5f7b5e94fd3919e6b38613f790a0bae88158044f262003719f52"

RPROVIDES:${PN} += "ocaml-pyml"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
