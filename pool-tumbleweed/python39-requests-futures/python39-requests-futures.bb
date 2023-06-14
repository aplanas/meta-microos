SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-requests-futures-1.0.0-3.1.noarch.rpm"
RPM_HASH = "c16eed7c599cbcbd253a5d0ea991a3de3aeb7addf7d2abeda06d640864a01760e17b30a21ba51cd3375b207ca1e2d553f60598f73e996d536cec1240710bacad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-futures \
python39-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
