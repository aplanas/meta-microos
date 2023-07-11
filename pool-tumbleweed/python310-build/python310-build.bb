SUMMARY = "Simple PEP517 package builder"
DESCRIPTION = "Build will invoke the PEP 517 hooks to build a distribution package. \
It is a simple build tool and does not perform any dependency management."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-build-0.10.0-3.3.noarch.rpm"
RPM_HASH = "cff89d3bd16f115370fc8dfa498d4e3d91063a065444353e8d92ff8556e1e32be588bbc2075edd81f77f0d054f41e9328db2c59d04e616936eae140978429d37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-build \
python310-build \
python3dist-build"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-packaging \
python310-pyproject-hooks \
update-alternatives"

inherit rpm
