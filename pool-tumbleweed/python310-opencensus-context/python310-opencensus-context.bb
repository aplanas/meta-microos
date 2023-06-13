SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python310-opencensus-context-0.1.3-1.3.noarch.rpm"
RPM_HASH = "c9fc78ffbc7f22a570174915b2d9d35fd92775a2aa3e1cb6eadd3d5e05ea07c7fa4be1d31799a7f1e31424aadf4bbfdf1dca54d20ecf6645f32f86ffd5124961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-context \
python3.10dist(opencensus-context) \
python310-opencensus-context \
python3dist(opencensus-context)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
