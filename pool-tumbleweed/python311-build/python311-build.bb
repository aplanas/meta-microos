SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python311-build-0.10.0-3.3.noarch.rpm"
RPM_HASH = "43c0fd508b229de43b4bbdc8d106f29742fd06d3e4cf45fc4028442efe850f5d3aa5ff035d769a9c76317607df2314a9f2868050b7b59e977a459b432cd919bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-build \
python3.11dist-build \
python311-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-packaging \
python311-pyproject-hooks \
update-alternatives"

inherit rpm
