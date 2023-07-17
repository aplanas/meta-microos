SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python39-mergedeep-1.3.4-3.1.noarch.rpm"
RPM_HASH = "8d8a3e66db63b341b25b2d377a673abf23191f3e43cc5ea773683b978a3dab41649462d47374f27df81aee55dd26d9e29a175051d04da8e378fdbd7eade59858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mergedeep \
python39-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
