SUMMARY = "Dependency generator dependencies for Python RPMs"
DESCRIPTION = "This package contains the dependencies for Python RPMs to generate \
dependencies automatically."
LICENSE = "WTFPL"

PV = "20230609.6fe8111"

RPM_NAME = "python-rpm-generators-20230609.6fe8111-2.1.noarch.rpm"
RPM_HASH = "1f7c846ff361f03b9d5da1c92e708ffd2e12d84db302a15c2dcc14ba13102d31bcf149dc77ef8e993c5a20458a1511f12d056fe11fefeb5b278b8783984bdd2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-rpm-generators \
python3-rpm-generators"

RDEPENDS:${PN} += "python-rpm-macros \
python3-setuptools"

inherit rpm
