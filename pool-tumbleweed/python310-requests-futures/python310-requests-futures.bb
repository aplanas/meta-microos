SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-requests-futures-1.0.0-3.1.noarch.rpm"
RPM_HASH = "ad7b4f54af5ce97bee97b5d9f3728ff08baa874f003259aae798a2451651b84a10f23aabf3437eff90f73f637b6dcedbe2d929fb7a36f1af6bb5beda1c5f893b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-futures \
python3.10dist(requests-futures) \
python310-requests-futures \
python3dist(requests-futures)"

RDEPENDS:${PN} += "python(abi) \
python310-requests"

inherit rpm
