SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python310-hammett-0.5.0-1.19.noarch.rpm"
RPM_HASH = "8a9ac6425bb15682371c077ae621d748d79ccdfd6d0a1a3a073e138728336475fe125cbff36c3917961d2d1d8b8606ccf2f05a6a61a474f54eecb3630075a453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-hammett \
python310-hammett \
python3dist-hammett"

RDEPENDS:${PN} += "python-abi \
python310-astunparse \
python310-colorama"

inherit rpm
