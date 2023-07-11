SUMMARY = "Library that versions your Python projects"
DESCRIPTION = "Incremental is a small library that versions your Python projects."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-incremental-22.10.0-2.2.noarch.rpm"
RPM_HASH = "9a05523137d6a188782d2acaba4e90b9011151f50abc74499b93b429e80082b359052f90755cd74ac9dc3eb26055ed6aff78208e2cc6553a8dad2d6e86311808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-incremental \
python39-incremental \
python3dist-incremental"

RDEPENDS:${PN} += "python-abi"

inherit rpm
