SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "19"

RPM_NAME = "ocaml-stdcompat-19-2.4.aarch64.rpm"
RPM_HASH = "30b2f0d095641a7dcb494aeb38344117130a71b97e5d4ae4c184542a31b53dcbc9cff92610818704d0d58faa98bd55ad79c9721b987bbdc4b0b6acb93233520a"

RPROVIDES:${PN} += "ocaml-stdcompat"

RDEPENDS:${PN} += ""

inherit rpm
