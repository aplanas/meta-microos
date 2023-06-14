SUMMARY = "Development files for ocaml-pcre"
DESCRIPTION = "The ocaml-pcre-devel package contains libraries and signature files for \
developing applications that use ocaml-pcre."
LICENSE = "LGPL-2.0-only"

PV = "7.5.0"

RPM_NAME = "ocaml-pcre-devel-7.5.0-2.10.aarch64.rpm"
RPM_HASH = "ba9e69b8384ffb35718883d93bf0838761e2a4796797abc3695627c7e4a1c3a3446a5e7abef3904f03be35f2dad77d15527425d206ceb138a30862c194d971a3"

RPROVIDES:${PN} += "ocaml-Pcre \
ocaml-pcre-devel \
ocamlfind-pcre \
ocamlx-Pcre"

RDEPENDS:${PN} += "libc.so.6 \
libpcre.so.1 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Array \
ocaml-Stdlib--Bytes \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Char \
ocaml-Stdlib--Either \
ocaml-Stdlib--List \
ocaml-Stdlib--Seq \
ocaml-Stdlib--String \
ocaml-Stdlib--Sys \
ocaml-Stdlib--Uchar \
ocaml-pcre \
ocamlx-Stdlib \
ocamlx-Stdlib--Array \
ocamlx-Stdlib--Bytes \
ocamlx-Stdlib--Callback \
ocamlx-Stdlib--List \
ocamlx-Stdlib--String \
ocamlx-Stdlib--Sys \
pcre-devel"

inherit rpm
