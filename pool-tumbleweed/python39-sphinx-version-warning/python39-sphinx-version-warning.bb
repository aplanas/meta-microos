SUMMARY = "Sphinx extension to add a warning banner"
DESCRIPTION = "Sphinx extension to add a warning banner"
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "python39-sphinx-version-warning-1.1.2-2.2.noarch.rpm"
RPM_HASH = "ecbf5f637405e5133fcc1133602fe2808e95e808baf8d8dc00dd69dadaf1877dbb4bf4d4214033b54af37a8889492de0594605a66602aa78486224b132ba9c09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sphinx-version-warning \
python39-sphinx-version-warning \
python3dist-sphinx-version-warning"

RDEPENDS:${PN} += "python-abi \
python39-Sphinx"

inherit rpm
