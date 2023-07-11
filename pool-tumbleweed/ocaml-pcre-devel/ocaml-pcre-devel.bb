SUMMARY = "Development files for ocaml-pcre"
DESCRIPTION = "The ocaml-pcre-devel package contains libraries and signature files for \
developing applications that use ocaml-pcre."
LICENSE = "LGPL-2.0-only"

PV = "7.5.0"

RPM_NAME = "ocaml-pcre-devel-7.5.0-2.11.aarch64.rpm"
RPM_HASH = "0fefc2f4888e5b1cdcd5711f0ba629c90c1fdb10044e2873cc4acabcc0b35684816e196d21bb9bdfbdcf070695e174a8966749064051794c5cb1d03defdcaba5"

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
