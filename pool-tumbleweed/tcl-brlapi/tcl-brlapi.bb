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

PV = "6.6"

RPM_NAME = "tcl-brlapi-6.6-1.1.aarch64.rpm"
RPM_HASH = "18ab8356c5783e3f19dbe8646a3ba8e3d949a5cf0d07e4c9655e6af62719ad646e30678374675333b16429ef2050a538cc2757b3d693d07e8fdcee5efb2b8d56"

RPROVIDES:${PN} += "libbrlapi-tcl.so.0.8 \
tcl-brlapi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6 \
libtcl8.6.so \
tcl"

inherit rpm
