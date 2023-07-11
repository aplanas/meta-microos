SUMMARY = "LDAS (LIGO Data Analysis System) tools abstraction toolkit language bindings"
DESCRIPTION = "This provides different language bindings for the LDAS tools abstaction library."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.7"

RPM_NAME = "ldas-tools-al-swig-2.6.7-3.8.aarch64.rpm"
RPM_HASH = "191b54d257ec06c171ab7780b4c828df2955a65e1764217bd94df3784a20cc079ef5e1db3a877ee058a70abeabac279c6f0e37146c03f88ec38bd85beaa3a362"

RPROVIDES:${PN} += "ldas-tools-al-swig \
python2-ldas-tools-al-swig"

RDEPENDS:${PN} += ""

inherit rpm
