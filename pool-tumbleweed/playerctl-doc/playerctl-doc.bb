SUMMARY = "Documentation for libplayerctl"
DESCRIPTION = "This package provides HTML documentation for libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-doc-2.4.1-1.9.noarch.rpm"
RPM_HASH = "cabd8326c6691a8be1b010e9d4a6ee0be083ffea7e606f1d39d0b91336940d48ff62168ab9c215136936f079f8372ea08a6f1a1490431ec703b0a132ca67ff77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-doc"

RDEPENDS:${PN} += ""

inherit rpm
