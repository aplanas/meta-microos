SUMMARY = "Headers and source files for developing with ldas-tools-al"
DESCRIPTION = "This package provides the headers and sources needed for developing programs using ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "ldas-tools-al-devel-2.6.4-1.14.aarch64.rpm"
RPM_HASH = "631f38624128fd7bc80b8a28438ac89b584225e05e03196255de744b3bf52af9659073848c52615d6568e3e2efb1cfee14be4d46272cc91b04ad5c49b5481c12"

RPROVIDES:${PN} += "ldas-tools-al-devel \
pkgconfig-ldastoolsal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldastoolsal7"

inherit rpm
