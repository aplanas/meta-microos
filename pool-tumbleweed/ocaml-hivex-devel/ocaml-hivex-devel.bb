SUMMARY = "OCAML bindings development files for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings development file \
for hivex. Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-devel-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "880ece1022a57d87a72502494dfc7e5075319ee54e38097141de8ec9e47979de24012572992bda05fa98d4db492e43dd2c8e9e2480b44f3b47167a5ae56af089"

RPROVIDES:${PN} += "ocaml-Hivex \
ocaml-hivex-devel \
ocamlfind-hivex \
ocamlx-Hivex"

RDEPENDS:${PN} += "hivex-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
ocaml-CamlinternalFormatBasics \
ocaml-Stdlib \
ocaml-Stdlib--Bigarray \
ocaml-Stdlib--Callback \
ocaml-Stdlib--Complex \
ocaml-Unix \
ocaml-hivex \
ocamlfind-unix \
ocamlx-Stdlib--Callback"

inherit rpm
