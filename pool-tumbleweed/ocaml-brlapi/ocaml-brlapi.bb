SUMMARY = "Library to use BRLTTY from applications -- OCaml Bindings"
DESCRIPTION = "BrlAPI is a service provided by the brltty daemon. \
 \
Its purpose is to allow programmers to write applications that take \
advantage of a braille terminal in order to deliver a blind user \
suitable information for his/her specific needs. \
 \
While an application communicates with the braille terminal, everything \
brltty sends to the braille terminal in the application's console is \
ignored, whereas each piece of data coming from the braille terminal is \
sent to the application, rather than to brltty."
LICENSE = "LGPL-2.1-or-later"

PV = "6.6"

RPM_NAME = "ocaml-brlapi-6.6-1.1.aarch64.rpm"
RPM_HASH = "56f455803fae28c429d718d8c45d73f4fe4071b0a2e757a43d03bc8f6d7b08bc5d4acc9e9b6e404a7bac41a854509f59041ddf21cd74715bf027b39d431691f9"

RPROVIDES:${PN} += "ocaml-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
ocaml"

inherit rpm
