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

RPM_NAME = "ocaml-brlapi-6.5-3.1.aarch64.rpm"
RPM_HASH = "c35b232bdacc8d14f05907ccafc7d0f743cabb574affdd422036b89117ec6952f46980783f4458090b30203ef550c54ffca8053ac0946aca222cedd594dda963"

RPROVIDES:${PN} += "ocaml-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
ocaml"

inherit rpm
