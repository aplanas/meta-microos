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

RPM_NAME = "brlapi-devel-6.5-2.3.aarch64.rpm"
RPM_HASH = "b3bef317784075a7f6028df5f21e8308ffab54fef5a0acf147ef47ae6cbf362ded5bf624c001e49c6cf96031631b44d9a535d44d39f63d53a7a8f6481288cdb6"

RPROVIDES:${PN} += "brlapi-devel brlapi-devel(aarch-64) pkgconfig(brltty)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libbrlapi0_8"

inherit rpm
