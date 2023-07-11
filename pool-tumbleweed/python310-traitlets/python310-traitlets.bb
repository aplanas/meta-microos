SUMMARY = "Traitlets Python configuration system"
DESCRIPTION = "A configuration system for Python applications."
LICENSE = "BSD-3-Clause"

PV = "5.9.0"

RPM_NAME = "python310-traitlets-5.9.0-2.3.noarch.rpm"
RPM_HASH = "f5e7c363cc8fcdbc3c1624457d04b43b8530165f10db94fad5fc8059551d8589513ae76add2d1715b9b49cea8a04aec2debfc7c5fca54db6ce639ef6b39818b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-traitlets \
python310-traitlets \
python3dist-traitlets"

RDEPENDS:${PN} += "python-abi"

inherit rpm
