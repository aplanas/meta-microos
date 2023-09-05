SUMMARY = "Incidenceeditor library"
DESCRIPTION = "This package contains the incidenceeditor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.08.0"

RPM_NAME = "incidenceeditor-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "54c064ed9ba6268491138fd105728bedb0687b671f687194bf05f22ea35b15e7629c01e8f3721839b33d96aa5002b61323dba1d23192b55e031d9d60469c195e"

RPROVIDES:${PN} += "incidenceeditor"

RDEPENDS:${PN} += ""

inherit rpm
