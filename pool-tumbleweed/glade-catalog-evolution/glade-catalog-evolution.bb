SUMMARY = "Glade catalog for the Evolution groupware library"
DESCRIPTION = "Evolution consists of modular components (at the moment: mailer, \
calendar, and address book) that should make daily life easier. Because \
of the modular design, it is possible to plug new components into \
Evolution or embed the existing ones in other applications. \
 \
This package provides a catalog for Glade, to allow the use of Evolution \
widgets in Glade."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "glade-catalog-evolution-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "30ee784e5b1bad554dea025bd9da616a3fab1ccfdd5af8e31eb79bf2a5079160dbd2776f32bcbd9c1bf1f6acaf54cc39748145fd58d76100bfdbcac6a2233e24"

RPROVIDES:${PN} += "glade-catalog-evolution \
libgladeevolution.so"

RDEPENDS:${PN} += "evolution \
glade"

inherit rpm
