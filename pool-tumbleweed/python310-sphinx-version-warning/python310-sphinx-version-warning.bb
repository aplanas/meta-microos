SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python310-sphinx-version-warning-1.1.2-2.2.noarch.rpm"
RPM_HASH = "792e43cb25507157975a2a4421fd6d5ce7b78b76f82eabbcb5c82e62d464cfad3af399d1cb86d6bc64a9a09d1897bd0f3a70a9aef65a1c092e53a79b494c93f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-version-warning \
python310-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
