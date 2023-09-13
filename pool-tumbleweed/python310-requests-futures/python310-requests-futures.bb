SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python310-requests-futures-1.0.1-1.1.noarch.rpm"
RPM_HASH = "dadac7304ee6143928b269d17b894fba31ca94531a50fff8fdb9ae0c155003a83fa1396b0ebfded12ad6fc0c394bed3e09254f2161f9d3eb01f23ce57b9449dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-futures \
python310-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
