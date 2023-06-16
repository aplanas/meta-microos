SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-build-0.10.0-3.1.noarch.rpm"
RPM_HASH = "13d242e2a9f4f1c0af2319eb7e903a2fac4cd6965b68b9d333daf1574b78b8786ad9824a8a8908a75953c5b75bb4c82a42a06679c6e8e478bef549bfc7602f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-build \
python311-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-pyproject-hooks \
update-alternatives"

inherit rpm
