SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python39-pygame-devel-2.1.3-2.2.aarch64.rpm"
RPM_HASH = "08ec72597804bd51cd102f7f8f0c86d514ac1b46b48f2d0765a8bf9582a468adbc2e03ecca9ac9ef8c336e49acc67421a21e6a3f16f3edee3f606fd071999544"

RPROVIDES:${PN} += "python39-pygame-devel"

RDEPENDS:${PN} += "python39-pygame"

inherit rpm
