SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python39-opencensus-context-0.1.3-1.4.noarch.rpm"
RPM_HASH = "7097e400c7f7ee1901a37524da4a256fd78083801c8f2e720a16a4ebf59a95a4b23eb82031199820b3864b993e0b2630774214ceb42e25a3d5159947e2c9be91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-opencensus-context \
python39-opencensus-context \
python3dist-opencensus-context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
