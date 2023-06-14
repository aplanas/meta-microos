SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python311-phabricator-0.9.1-1.3.noarch.rpm"
RPM_HASH = "f57bafa6af3022a1b0d5f44522bc9abd6c2322110f2876918c69340496d7301aa3d77813129103e4655db9d97eefb6b70d200e27cb6cb3ac115769a07350d5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-phabricator \
python311-phabricator \
python3dist-phabricator"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
