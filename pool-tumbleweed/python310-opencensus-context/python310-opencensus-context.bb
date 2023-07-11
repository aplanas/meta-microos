SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python310-opencensus-context-0.1.3-1.4.noarch.rpm"
RPM_HASH = "5a60cc3c8e4f991b09903cc56aeced2cc192c2aedbdc232e4fb1434d9e824506cf754743c4659085f3bdf840b8834f0e3e2b34b4aba2b1eecd578ea25a54c75f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-opencensus-context \
python310-opencensus-context \
python3dist-opencensus-context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
