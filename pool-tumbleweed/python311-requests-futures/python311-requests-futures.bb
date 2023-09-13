SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python311-requests-futures-1.0.1-1.1.noarch.rpm"
RPM_HASH = "be59c55c0e02a112185d3d7c53e77e7ee55af8b101c556b5e17f56c67f8e5b9c23e625bf23281dee3cf09697003f11343fb3e828900de730be326c441246d5a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-futures \
python3.11dist-requests-futures \
python311-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python311-requests"

inherit rpm
