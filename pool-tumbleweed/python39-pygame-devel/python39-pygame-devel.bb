SUMMARY = "Pygame development package"
DESCRIPTION = "This package contains the header files for developers of Pygame."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.3"

RPM_NAME = "python39-pygame-devel-2.1.3-2.1.aarch64.rpm"
RPM_HASH = "fd4b4e8fb61f4a684620e697b1e149e725ee9b1332fcd966a8689eadf1fca180e7cf3ff2a26f479a13288e41a813a81ca2b03b516532232931d28169b6a548bf"

RPROVIDES:${PN} += "python39-pygame-devel"

RDEPENDS:${PN} += "python39-pygame"

inherit rpm
