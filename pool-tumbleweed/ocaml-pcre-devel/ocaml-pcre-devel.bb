SUMMARY = "Development files for ocaml-pcre"
DESCRIPTION = "The ocaml-pcre-devel package contains libraries and signature files for \
developing applications that use ocaml-pcre."
LICENSE = "LGPL-2.0-only"

PV = "7.5.0"

RPM_NAME = "ocaml-pcre-devel-7.5.0-2.10.aarch64.rpm"
RPM_HASH = "ba9e69b8384ffb35718883d93bf0838761e2a4796797abc3695627c7e4a1c3a3446a5e7abef3904f03be35f2dad77d15527425d206ceb138a30862c194d971a3"

RPROVIDES:${PN} += "ocaml(Pcre) \
ocaml-pcre-devel \
ocaml-pcre-devel(aarch-64) \
ocamlfind(pcre) \
ocamlx(Pcre)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libpcre.so.1()(64bit) \
ocaml(CamlinternalFormatBasics) \
ocaml(Stdlib) \
ocaml(Stdlib__Array) \
ocaml(Stdlib__Bytes) \
ocaml(Stdlib__Callback) \
ocaml(Stdlib__Char) \
ocaml(Stdlib__Either) \
ocaml(Stdlib__List) \
ocaml(Stdlib__Seq) \
ocaml(Stdlib__String) \
ocaml(Stdlib__Sys) \
ocaml(Stdlib__Uchar) \
ocaml-pcre \
ocamlx(Stdlib) \
ocamlx(Stdlib__Array) \
ocamlx(Stdlib__Bytes) \
ocamlx(Stdlib__Callback) \
ocamlx(Stdlib__List) \
ocamlx(Stdlib__String) \
ocamlx(Stdlib__Sys) \
pcre-devel"

inherit rpm
