SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-mips-gcc12-icecream-backend-12.3.0+git1204-1.2.aarch64.rpm"
RPM_HASH = "3158c647a4536b95e17dcd93a62ac8e787d8efede69e56134fb4797554d35aa137f9f4f6b250ffaa44a475945079ff48602fa3f1d9e0f2ab2eb60627e6fe94b5"

RPROVIDES:${PN} += "cross-mips-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
