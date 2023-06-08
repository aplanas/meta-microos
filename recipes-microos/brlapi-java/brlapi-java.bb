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

RPM_NAME = "brlapi-java-6.5-2.3.aarch64.rpm"
RPM_HASH = "8450ea27912d3bd7168d9fb4f5c1124f8545e7995a20e61087bbf836e6b200590ff62fd923f107712b2ea6f7bf0ea468ce2ff2f4ee83700684f1907321a73ce6"

RPROVIDES:${PN} += "brlapi-java brlapi-java(aarch-64) libbrlapi_java.so.0.8()(64bit)"
RDEPENDS:${PN} += "java jpackage-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrlapi.so.0.8()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
