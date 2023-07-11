SUMMARY = "Asynchronous Python HTTP Requests for Humans using Futures"
DESCRIPTION = "Small add-on for the python requests_ http library. Makes use of python 3.2’s \
concurrent.futures or the backport for prior versions of python."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python310-requests-futures-1.0.0-3.2.noarch.rpm"
RPM_HASH = "3f3fd30f8641ed23370fd4c11449df8a126162572455d0d46859b2e0abdcb6cf434f6ae32e7b91fd4d1251a4445c1b6d046daa1d13d1f0e2c460f5553eee9dd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-futures \
python310-requests-futures \
python3dist-requests-futures"

RDEPENDS:${PN} += "python-abi \
python310-requests"

inherit rpm
