SUMMARY = "Sphinx directives versionremoved and removed-in"
DESCRIPTION = "Sphinx Removed In Extension"
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python310-sphinx-removed-in-0.2.1-2.5.noarch.rpm"
RPM_HASH = "650fd6c7f2f6b9ee9452429d079541c3a00010f9794bd395e367f059e43527b8040616a33828da6369592ddf339bd214ee39c2026c7a792c6fa43ac52f3ecb61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-sphinx-removed-in \
python310-sphinx-removed-in \
python3dist-sphinx-removed-in"

RDEPENDS:${PN} += "python-abi \
python310-Sphinx"

inherit rpm
