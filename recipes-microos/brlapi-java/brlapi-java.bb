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

RPM_NAME = "brlapi-java-6.5-2.4.aarch64.rpm"
RPM_HASH = "101cdc3adbc4816443c60302a4207f291fb125197e2d96ed8d5fb137161c64df641595773f51f6a3d2b7d6a5b49d7fcc8b882882c16376b3baacff6d4ea2c65e"

RPROVIDES:${PN} += "brlapi-java brlapi-java(aarch-64) libbrlapi_java.so.0.8()(64bit)"
RDEPENDS:${PN} += "java jpackage-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
