SUMMARY = "Git repository fixture for pytest"
DESCRIPTION = "Git repository fixture for py.test"
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python310-pytest-git-1.7.0-2.15.noarch.rpm"
RPM_HASH = "034aeffe13fad6b136d04c5ad971d99e02e61ac34663e5ed1dab9653435f98dcca1637ef40b95e5b66c12656e093d283fd6d802c689bc0934f64c79289b69773"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-git \
python310-pytest-git \
python3dist-pytest-git"

RDEPENDS:${PN} += "python-abi \
python310-GitPython \
python310-pytest \
python310-pytest-shutil"

inherit rpm
