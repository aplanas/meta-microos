SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.1"

RPM_NAME = "python39-requests-futures-1.0.1-1.1.noarch.rpm"
RPM_HASH = "49074f035879ac05879d7c28732008145daf81d03032da3956a15f791c3791605d78ba8b5122d598cf932168072d3e8211c54e1aeb2e465e7afd957e1829f189"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-requests-futures \
python39-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python39-requests"

inherit rpm
