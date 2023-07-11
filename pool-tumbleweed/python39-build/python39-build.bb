SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python39-build-0.10.0-3.3.noarch.rpm"
RPM_HASH = "78a8b9b614d9cddd5c52871b3a75fab730df31b83d587326538b4f0e2639528e6fae6c20af04bc68c45f7113c2bc5d5c209789bff059a4a0105fa6edd8290bb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-build \
python39-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-packaging \
python39-pyproject-hooks \
update-alternatives"

inherit rpm
