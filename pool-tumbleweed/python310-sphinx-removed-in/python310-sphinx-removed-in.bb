SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-sphinx-removed-in-0.2.1-2.3.noarch.rpm"
RPM_HASH = "a878cd4e22808b80f7f55bf4f73ef83a36306e9a09199078621c4467afa259430522074fa7da0f8839467650415e8582f098b461482be2f2b7d536aac32576f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-removed-in \
python3.10dist-sphinx-removed-in \
python310-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
