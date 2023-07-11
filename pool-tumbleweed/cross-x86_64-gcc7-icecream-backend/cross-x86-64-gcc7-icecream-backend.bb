SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-icecream-backend-7.5.0+r278197-14.2.aarch64.rpm"
RPM_HASH = "49ebc2cb05b501c732e330afd72df2ef68e850bcbb14202454852b8944d216841eeeae6d77f85595d12a8503d26a925997c15f3ee86352ecb9dd803bf34de3de"

RPROVIDES:${PN} += "cross-x86-64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
