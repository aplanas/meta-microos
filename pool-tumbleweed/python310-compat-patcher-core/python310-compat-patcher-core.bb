SUMMARY = "Python patcher system"
DESCRIPTION = "Python patcher system to allow easy and lasting API compatibility."
LICENSE = "MIT"

PV = "2.1"

RPM_NAME = "python310-compat-patcher-core-2.1-1.4.noarch.rpm"
RPM_HASH = "a619abe6b74dde87826d377333877fdeb1f80ea4da2572dc27d8cdc690a85720123f068bff952997d3630821e1e7ede62dea07892205ead4ad2e1f349f282016"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-compat-patcher-core \
python310-compat-patcher-core \
python3dist-compat-patcher-core"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
