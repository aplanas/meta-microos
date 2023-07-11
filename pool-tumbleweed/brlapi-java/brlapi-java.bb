SUMMARY = "Library to use BRLTTY from applications -- Java Bindings"
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

RPM_NAME = "brlapi-java-6.5-3.1.aarch64.rpm"
RPM_HASH = "04aaaa01ff868c9f77799b3a3d94eef497cf40d5acf66626bbad5533b81ce745a7c7246ddbba708372df5d131b7ad2992f12ab311a6e4720d2d114b7b536807d"

RPROVIDES:${PN} += "brlapi-java \
libbrlapi-java.so.0.8"

RDEPENDS:${PN} += "java \
jpackage-utils \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
