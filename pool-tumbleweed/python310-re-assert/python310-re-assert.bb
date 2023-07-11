SUMMARY = "Show Python regex match assertion failures"
DESCRIPTION = "Show where your regex match assertion failed."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python310-re-assert-1.1.0-2.3.noarch.rpm"
RPM_HASH = "aa5d204620586bb18d7a8c98f2f1169a8de0c652377bef53c23045ae91c7e77bfb2fa394dc274eb0abd2b12643dd481738c1e6a5982eaaae62f9fd1e2eaa9b52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-re-assert \
python310-re-assert \
python3dist-re-assert"

RDEPENDS:${PN} += "python-abi \
python310-regex"

inherit rpm
