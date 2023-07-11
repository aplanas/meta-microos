SUMMARY = "Header and library from gmic for use in other C++ projects"
DESCRIPTION = "Header and library from gmic to needed to develop C++ code that \
uses the gmic functionality provided by the gmic library."
LICENSE = "CECILL-2.1"

PV = "3.2.6"

RPM_NAME = "libgmic-devel-3.2.6-1.1.aarch64.rpm"
RPM_HASH = "d288dfd9dae5ef14c8d3f6115e21711e3f5dd32a7ac468223524aeddc0beabdd16855c2da72bee98848b5086f114efdeaa6a1ef64f42c054c203821868e4fc0a"

RPROVIDES:${PN} += "libgmic-devel"

RDEPENDS:${PN} += "libgmic3"

inherit rpm
