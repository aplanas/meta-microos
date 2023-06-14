SUMMARY = "OCAML bindings development files for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings development file \
for hivex. Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-devel-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "5f7bd8e4292c6e7e527ccd97a8402ea91a92473762bf76892386e509b471b9b87d1ceb2bbbeef3ddf25ba6be235d4ed91edfac71ebaeac8f48229abdf7f912ae"

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
