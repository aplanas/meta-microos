SUMMARY = "Facilities for working with VCS repositories"
DESCRIPTION = "Facilities for working with VCS repositories"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-jaraco.vcs-1.1.0-1.1.noarch.rpm"
RPM_HASH = "d7dddeb0ac43dcd706709960bb32fbbe2e22f03f0b6368c15a5081333ae53a05712fa34935c065e330e47c0ea68e05b3701dea4c7af8d2f3d3756de47da65fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.vcs \
python310-jaraco.vcs \
python3dist-jaraco.vcs"

RDEPENDS:${PN} += "python-abi \
python310-jaraco.classes \
python310-jaraco.versioning \
python310-more-itertools \
python310-packaging"

inherit rpm
