SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-requests-futures-1.0.0-3.2.noarch.rpm"
RPM_HASH = "6bcc0767494485fbcad2e983c63e52999c7590cbd55afe7b7ed38013098bdf39107070890224a9e6beb47f5a60d263160d9e6875ad8227d196f1796f9670fa18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-futures \
python39-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
