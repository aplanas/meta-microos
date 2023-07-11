SUMMARY = "Python in-process context propogation"
DESCRIPTION = "The OpenCensus Runtime Context provides in-process context propagation. \
By default, thread local storage is used for Python 2.7, 3.4 and 3.5; \
contextvars is used for Python >= 3.6, which provides asyncio support."
LICENSE = "Apache-2.0"

PV = "0.1.3"

RPM_NAME = "python311-opencensus-context-0.1.3-1.4.noarch.rpm"
RPM_HASH = "6d65e1cb433370409c21427e40bf40e7b4b41ffb6804418b68339ad7ac7c512dc70b8edf41398e8a5619c491892dad530a9a791150c18ed87664f8cc80546f0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opencensus-context \
python3.11dist-opencensus-context \
python311-opencensus-context \
python3dist-opencensus-context"

RDEPENDS:${PN} += "python-abi"

inherit rpm
