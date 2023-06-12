SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python311-requests-futures-1.0.0-3.1.noarch.rpm"
RPM_HASH = "e41157778c07c4ae2a31e421ea87c253deffb76986513dbde7e3871ad72ba9196ba635d8fdf65692316ce396d44df4edb5ed88dc84e0fdf4883e53d4195e8d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-futures) \
python311-requests-futures \
python3dist(requests-futures)"
RDEPENDS:${PN} += "python(abi) \
python311-requests"

inherit rpm
