SUMMARY = "Perl compatibility regular expressions (PCRE) for OCaml"
DESCRIPTION = "Perl compatibile regular expressions (PCRE) for OCaml."
LICENSE = "LGPL-2.0-only"

PV = "7.5.0"

RPM_NAME = "ocaml-pcre-7.5.0-2.11.aarch64.rpm"
RPM_HASH = "08e509205506d605b24275df4dd2d37b74f7efafc47ceb43af7db2278d83060b784bdc8a15ae25777db14fb99a92640397c752b90a2329ff5c4007a8de4c7281"

RPROVIDES:${PN} += "ocaml-pcre"

RDEPENDS:${PN} += "libc.so.6 \
libpcre.so.1"

inherit rpm
