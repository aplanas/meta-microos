SUMMARY = "Perl compatibility regular expressions (PCRE) for OCaml"
DESCRIPTION = "Perl compatibile regular expressions (PCRE) for OCaml."
LICENSE = "LGPL-2.0-only"

PV = "7.5.0"

RPM_NAME = "ocaml-pcre-7.5.0-2.10.aarch64.rpm"
RPM_HASH = "0f19e31b595b3b566c8244923575a2babc3ee05043585f982fc8541a50ecd1188da14813e9a7e810ce53b96d39001dfcc1d0c1340213ec6a0fbf801e77f1c408"

RPROVIDES:${PN} += "ocaml-pcre \
ocaml-pcre(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
