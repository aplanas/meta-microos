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

PV = "6.5"

RPM_NAME = "brlapi-devel-6.5-3.1.aarch64.rpm"
RPM_HASH = "d874bacf4e0ae90bec7163a0c85020234465ddbe597da28f1832cbf96a0facb2413fe3c2f96fabb33179a03d2749b468fbeaac0450b1bf5281163a34c74771b7"

RPROVIDES:${PN} += "brlapi-devel \
pkgconfig-brltty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrlapi0-8"

inherit rpm
