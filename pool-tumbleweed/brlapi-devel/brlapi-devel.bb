SUMMARY = "Library to use BRLTTY from applications -- Development Files"
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

RPM_NAME = "brlapi-devel-6.6-1.1.aarch64.rpm"
RPM_HASH = "4aefa8f044e919b16d3f0b2250c86eaeb139571d6e40ead664fb984e04ec9eae65ec3c468d1a86d015b1bf0453880d6e93d94916b17fc8e3ef0bd243bffa4f96"

RPROVIDES:${PN} += "brlapi-devel \
pkgconfig-brltty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrlapi0-8"

inherit rpm
