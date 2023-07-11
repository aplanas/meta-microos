SUMMARY = "Development headers for the InChI library"
DESCRIPTION = "This package contains the development files for the InChI library."
LICENSE = "LGPL-2.0-or-later"

PV = "1.06"

RPM_NAME = "inchi-devel-1.06-2.4.aarch64.rpm"
RPM_HASH = "2108ed85e8046dea1939ee46edd30d33adea26fb71d7414e7a30dd28ec63c6752b32aecbce2b2cdc245734aa8f28ce9baa40f5778489c469b7777353391048b8"

RPROVIDES:${PN} += "inchi-devel"

RDEPENDS:${PN} += "libinchi1"

inherit rpm
