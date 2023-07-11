SUMMARY = "Pure OCaml regular expressions"
DESCRIPTION = "Pure OCaml regular expressions, with support for Perl and POSIX-style strings."
LICENSE = "LGPL-2.1-or-later-with-OCaml-LGPL-linking-exception"

PV = "1.10.4"

RPM_NAME = "ocaml-re-1.10.4-1.6.aarch64.rpm"
RPM_HASH = "1444af6d96161b168eab238f1122dd81b29b88ce89761e0aac57c078dd2fdab3b8663ad6080016054c37f1e554e296bbb1d55fab9ffb63c68dc5b8bd566f2511"

RPROVIDES:${PN} += "ocaml-re"

RDEPENDS:${PN} += ""

inherit rpm
