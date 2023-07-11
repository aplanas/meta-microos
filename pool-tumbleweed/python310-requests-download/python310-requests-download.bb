SUMMARY = "Python module to download and save files using python-requests"
DESCRIPTION = "This module downloads files using requests and saves them to a target path."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python310-requests-download-0.1.2-3.1.noarch.rpm"
RPM_HASH = "928eeeec84611fbe74dc42479edb913ac9359519cf370c9282ffe92d3e8449c0fb13fc447b0e387150236fb2d495589eb5ed17dd113b7db276ba5186f5b6d194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-download \
python310-requests-download \
python3dist-requests-download"

RDEPENDS:${PN} += "python-abi \
python310-progressbar \
python310-requests"

inherit rpm
