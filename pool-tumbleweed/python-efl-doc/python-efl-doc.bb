SUMMARY = "Documentation for python-efl"
DESCRIPTION = "HTML formated documentation for python-efl module."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "1.25.0"

RPM_NAME = "python-efl-doc-1.25.0-2.6.aarch64.rpm"
RPM_HASH = "9330ded120d18859ce8211b2f1631742d0da36ec845367837613d5b46ec1ea98047d7d0b493e9e2de19fa16daa67a059dd9e39b8099401d5f1a7b987c07b36ba"

RPROVIDES:${PN} += "python-efl-doc \
python-efl-doc(aarch-64) \
python3-efl-doc"
RDEPENDS:${PN} += ""

inherit rpm
