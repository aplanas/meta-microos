SUMMARY = "OCAML bindings development files for libhivex"
DESCRIPTION = "This subpackage contains the OCAML bindings development file \
for hivex. Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "ocaml-hivex-devel-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "033bb30a4deea8b6d5340d3d4dc59437246c314026560c16deb0973084593c33429be3a52f4de52b1edb3e9a57576c3277437360cecf4eb61dcdabc50039a34e"

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
