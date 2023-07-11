SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python39-traitlets-5.9.0-2.3.noarch.rpm"
RPM_HASH = "0fafc9aa56941d1daeb609fb505dbb3c980ef926e9c26531f8a17d2b5a2ad58a39a6c8ee16da3dc8909fd0edba68a879f75d5671f0d2e0febb673fc6db2319a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-traitlets \
python39-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
