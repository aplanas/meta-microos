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

PV = "6.6"

RPM_NAME = "brlapi-java-6.6-1.1.aarch64.rpm"
RPM_HASH = "952f2800d5176517c3e6c29723ef1fdb11a568859aa8e7994a1e51096e3601389a5d68f317965629a58d18042633233e6eab3f9a09129b40cfcb7e1eba3b1179"

RPROVIDES:${PN} += "brlapi-java \
libbrlapi-java.so.0.8"

RDEPENDS:${PN} += "java \
jpackage-utils \
ld-linux-aarch64.so.1 \
libbrlapi.so.0.8 \
libc.so.6"

inherit rpm
