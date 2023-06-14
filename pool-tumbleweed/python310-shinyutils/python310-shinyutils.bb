SUMMARY = "Various utilities for Python"
DESCRIPTION = "This package contains utilities for tasks in Python, including \
matplotlib, subclasses, argument parsing, and logging."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-shinyutils-3.1.0-2.9.noarch.rpm"
RPM_HASH = "1a3d83189193ce92e7cb56b614ae406e8486a4a4b904786984dabc368494227412087b7cdcb0c2fd72d01f3d6aae8dff7328c9320fd894882b2e2196bb9bf4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shinyutils \
python3.10dist-shinyutils \
python310-shinyutils \
python3dist-shinyutils"

RDEPENDS:${PN} += "python-abi \
python310-crayons \
python310-matplotlib \
python310-seaborn"

inherit rpm
