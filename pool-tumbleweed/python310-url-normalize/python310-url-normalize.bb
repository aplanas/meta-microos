SUMMARY = "URL normalization for Python"
DESCRIPTION = "URL normalization for Python."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python310-url-normalize-1.4.3-2.1.noarch.rpm"
RPM_HASH = "f16044145f8a79a486ebefc1ca6ff8e7f1273271ce52016fda691111b95ec302492e34f72485f6d05ff088ba45ea74e772d5b8b9adbec6b60d5a23df8ee7bc8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-url-normalize \
python3.10dist-url-normalize \
python310-url-normalize \
python3dist-url-normalize"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
