SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-build-0.10.0-3.1.noarch.rpm"
RPM_HASH = "bf6c3ff0d26742fc8eec61308e9cbceebcaf8dc631dea3287f293dcde08f8af9ba573f0de0e464a611ca30becff8fc5c6384b8a9d54b39d238fe87e4ddecf994"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-build \
python3.10dist(build) \
python310-build \
python3dist(build)"

RDEPENDS:${PN} += "(python310-importlib-metadata >= 0.22 if python310-base < 3.8) \
(python310-tomli >= 1.1.0 if python310-base < 3.11) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-packaging \
python310-pyproject-hooks \
update-alternatives"

inherit rpm
