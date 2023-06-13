SUMMARY = "Documentation for power-profiles-daemon"
DESCRIPTION = "This package provides documentation for power-profiles-daemon."
LICENSE = "GPL-3.0-or-later"

PV = "0.13"

RPM_NAME = "power-profiles-daemon-doc-0.13-1.1.noarch.rpm"
RPM_HASH = "758ed3f96f981f17a50384a32a7418e80e926d0fdec8754f6a822ac23700aee7e0924ee97d88dfdfce360eca13fd284be2a7380e2924ce4b8d09db5d5ba43151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "power-profiles-daemon-doc"

RDEPENDS:${PN} += ""

inherit rpm
