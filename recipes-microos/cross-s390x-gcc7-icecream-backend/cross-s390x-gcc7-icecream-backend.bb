SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-s390x-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "81217bd33f796cf06802a70671b6003b5df49f286a6ee623009caed1f406527a1180c947929334494e842feac9e4c276331a9dd7f59a0e0f8b43e638e08b6363"

RPROVIDES:${PN} += "cross-s390x-gcc7-icecream-backend cross-s390x-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
