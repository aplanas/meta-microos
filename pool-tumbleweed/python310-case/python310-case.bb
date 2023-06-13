SUMMARY = "Python unittest Utilities"
DESCRIPTION = "Python unittest Utilities."
LICENSE = "BSD-3-Clause"

PV = "1.5.3"

RPM_NAME = "python310-case-1.5.3-7.3.noarch.rpm"
RPM_HASH = "2e8eed1b4eec7eb43f3915c703d5248c1e2ec4b8c8ef6910160f320199944c3e52e0f81ec8a8f5ff0cb23638c760fb21f780c82a7559818fbe0324250159b3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-case \
python3.10dist(case) \
python310-case \
python3dist(case)"

RDEPENDS:${PN} += "python(abi) \
python310-pytest \
python310-setuptools \
python310-six"

inherit rpm
