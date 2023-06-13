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

PV = "6.5"

RPM_NAME = "ocaml-brlapi-6.5-2.4.aarch64.rpm"
RPM_HASH = "716d8ec04061793e8a2b962546fa73b8cb2af31aa52cf7c93827d2b118b0c6f818ceb073f0d913f5741bb4db854c6490c147fcff6642b9d79c997bc5612a55ad"

RPROVIDES:${PN} += "ocaml-brlapi \
ocaml-brlapi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbrlapi.so.0.8()(64bit) \
libc.so.6()(64bit) \
ocaml"

inherit rpm
