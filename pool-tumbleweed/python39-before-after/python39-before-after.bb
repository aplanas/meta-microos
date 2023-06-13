SUMMARY = "Python utilities for testing race conditions"
DESCRIPTION = "before_after provides utilities for testing race conditions."
LICENSE = "GPL-2.0-only"

PV = "1.0.1"

RPM_NAME = "python39-before-after-1.0.1-2.6.noarch.rpm"
RPM_HASH = "60eb20b0021777004244c769c7d4c1dd19f23d616587468c67c69b7adef8f4f0a48d0167baecdb4459b8a822a9409b27b7079512ca8935887189e407ee97a52e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(before-after) \
python39-before-after \
python3dist(before-after)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
