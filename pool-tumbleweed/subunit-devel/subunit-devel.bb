SUMMARY = "Header files for developing C applications that use subunit"
DESCRIPTION = "Header files and libraries for developing C applications that use subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-devel-1.4.2-3.1.aarch64.rpm"
RPM_HASH = "65a216e4b997b6719fe5d0f049faceed7c6bf59dad950f49b7c324d881da16c0ef931f1b88e13d118dc9349115d5354f1b99ad0000fd7ab8e37fd09fc7b8f0d6"

RPROVIDES:${PN} += "pkgconfig-libsubunit \
subunit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubunit0 \
subunit"

inherit rpm
