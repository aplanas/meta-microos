SUMMARY = "Glade catalog for the Evolution groupware library"
DESCRIPTION = "Evolution consists of modular components (at the moment: mailer, \
calendar, and address book) that should make daily life easier. Because \
of the modular design, it is possible to plug new components into \
Evolution or embed the existing ones in other applications. \
 \
This package provides a catalog for Glade, to allow the use of Evolution \
widgets in Glade."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "glade-catalog-evolution-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "2ccd6c03e76dea443b37051a237d22bf7a8460e63582ffe6026bee56f14590122be69895e41551c9003c2d033d6c8b3752ae71b5f531b72e21a8ff039c4da0d5"

RPROVIDES:${PN} += "glade-catalog-evolution \
glade-catalog-evolution(aarch-64) \
libgladeevolution.so()(64bit)"
RDEPENDS:${PN} += "evolution \
glade"

inherit rpm
