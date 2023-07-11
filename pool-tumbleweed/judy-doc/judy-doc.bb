SUMMARY = "Development files for Judy"
DESCRIPTION = "This package contains documentation about Judy library and examples."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.5"

RPM_NAME = "judy-doc-1.0.5-10.13.noarch.rpm"
RPM_HASH = "bc7dca9acdfaa8e3b8537397b611ef8832d9751dedadc16bc35cba4cee04a447383a3b443354a59d570b952ed422b796970a16ad9b5bf01087feebf3a2980bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "judy-doc"

RDEPENDS:${PN} += ""

inherit rpm
