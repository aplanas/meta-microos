SUMMARY = "New Austrian ispell dictionary"
DESCRIPTION = "This package includes a ready Austrian dictionary for ispell according \
the new spelling rules.  The name of the dictionary is naustrian to be able \
to distinguish it from those of the German packages. A short usage \
description is given in /usr/share/doc/packages/ispell/README of the \
package ispell."
LICENSE = "GPL-2.0+"

PV = "20161207"

RPM_NAME = "ispell-naustrian-20161207-2.14.aarch64.rpm"
RPM_HASH = "ec2e4ab17bca77fca90fbb03e4b27991a1377bc733562e945c9a9e3f7b3c64c3278641a78c4812e53535a1d53f0e57d318d50fc35653974d7ffc0a47a3df81cb"

RPROVIDES:${PN} += "ispell-naustrian \
ispell-naustrian(aarch-64) \
ispell_dictionary \
locale(ispell:de_AT)"

RDEPENDS:${PN} += ""

inherit rpm
