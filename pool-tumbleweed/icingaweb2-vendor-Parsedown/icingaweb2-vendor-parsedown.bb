SUMMARY = "Icinga Web 2 vendor library Parsedown"
DESCRIPTION = "Icinga Web 2 vendor library Parsedown."
LICENSE = "MIT"

PV = "2.11.4"

RPM_NAME = "icingaweb2-vendor-Parsedown-2.11.4-3.1.noarch.rpm"
RPM_HASH = "794a46af3ee5601606e81ec5a75a4ced9017ecc22f3b5eabdebc4638c340528bb89a1f82b3a9dbb1ba84e7c5c4d06bcf00c4065cd998b360ba6a8fb3480267f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icingaweb2-vendor-Parsedown"

RDEPENDS:${PN} += "icingaweb2-common \
php"

inherit rpm
