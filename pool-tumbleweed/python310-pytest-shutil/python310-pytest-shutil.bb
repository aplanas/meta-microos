SUMMARY = "A goodie-bag of unix shell and environment tools for pytest"
DESCRIPTION = "This library is a goodie-bag of Unix shell and environment management \
tools for automated tests."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-shutil-1.7.0-6.3.noarch.rpm"
RPM_HASH = "339896cebced7fe9e0db4be9ba587c32ad49a97bca1ac7d76a630214b8e1c37fbc9fbcb90a9bca867ead9ff2369ed729e589a24eaa704041350652c97a3cfee1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-shutil \
python3.10dist-pytest-shutil \
python310-pytest-shutil \
python3dist-pytest-shutil"

RDEPENDS:${PN} += "python-abi \
python310-execnet \
python310-path \
python310-pytest \
python310-six \
python310-termcolor"

inherit rpm
