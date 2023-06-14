SUMMARY = "Lightproof for ru_RU"
DESCRIPTION = "Lightproof grammar checker information for ru_RU."
LICENSE = "AGPL-3.0-only & BSD-2-Clause & BSD-3-Clause & BSD-4-Clause & CC-BY-SA-1.0 & CC-BY-SA-3.0 & GFDL-1.1-only & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & GPL-3.0-or-later & LGPL-2.0-only & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & LGPL-3.0-or-later & MPL-1.1"

PV = "20221012"

RPM_NAME = "myspell-lightproof-ru_RU-20221012-1.2.aarch64.rpm"
RPM_HASH = "94881e23cf68c924e13bc2d24c8f71400fc771edbd22591638bb3a66b34c598aed744d9425b299b3f3fe3cab19d484f28b32fc0a352209c36827fcc4b624b3d0"

RPROVIDES:${PN} += "myspell-lightproof-ru-RU"

RDEPENDS:${PN} += "myspell-ru-RU"

inherit rpm
