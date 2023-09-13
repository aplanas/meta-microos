SUMMARY = "User documentation for FreeTDS"
DESCRIPTION = "The freetds-doc package contains the useguide and reference of FreeTDS \
and can be installed even if FreeTDS main package is not installed"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.3.20"

RPM_NAME = "freetds-doc-1.3.20-1.1.aarch64.rpm"
RPM_HASH = "ebb2c5fa5ade9d54613bc8f2601601fe76a019fb489946b32982770311c3a9815766dd814556c6e518589304218ed2e82e7cab25985d470fa7d88b2da6ed92c7"

RPROVIDES:${PN} += "freetds-doc"

RDEPENDS:${PN} += ""

inherit rpm
