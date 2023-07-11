SUMMARY = "Library to use BRLTTY from applications -- Tcl Bindings"
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

RPM_NAME = "tcl-brlapi-6.5-3.1.aarch64.rpm"
RPM_HASH = "5a19a186cbc317af08cd011ffb661d03d064cc5d73cc806432165c6b3fef633a4b7a854c71db494571e5afb365a26ed75439c8807cdaa769392f0a793c32ed74"

RPROVIDES:${PN} += "libbrlapi-tcl.so.0.8 \
tcl-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
libtcl8.6.so \
tcl"

inherit rpm
