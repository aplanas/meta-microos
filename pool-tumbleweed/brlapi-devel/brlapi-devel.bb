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

RPM_NAME = "brlapi-devel-6.5-2.4.aarch64.rpm"
RPM_HASH = "69ba91e07b8c9ddcfd89121fb667b16e408560268dd22ea0b87d238781d1164656397dbc6fb2bfc8db598352cce89a1e9f1b7f21cd275868612bcea6c9e8ccb6"

RPROVIDES:${PN} += "brlapi-devel \
pkgconfig-brltty"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbrlapi0-8"

inherit rpm
