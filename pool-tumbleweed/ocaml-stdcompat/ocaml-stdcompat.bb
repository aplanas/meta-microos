SUMMARY = "Stdcompat: compatibility module for OCaml standard library"
DESCRIPTION = "Stdcompat is a compatibility layer allowing programs to use some recent additions to the OCaml standard library while preserving the ability to be compiled on former versions of OCaml."
LICENSE = "BSD-2-Clause"

PV = "19"

RPM_NAME = "ocaml-stdcompat-19-2.5.aarch64.rpm"
RPM_HASH = "838c3ec906f3bbf596ab68ec726897405865b0ed63908c21e484b2f7b122284f69acce67a326e6f8e7ea5dbe93a0cbd126f518b6f4ff507841b0908634579e0b"

RPROVIDES:${PN} += "ocaml-stdcompat"

RDEPENDS:${PN} += ""

inherit rpm
