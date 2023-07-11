SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-requests-unixsocket-0.3.0-3.3.noarch.rpm"
RPM_HASH = "648bed6dc8428be123c0481860dc084674b8ed11179ffee6245fe33ed7c1ce41614bd0adb0d491745e7763d46658ce871c8f95c2e05cdff82af470c765c88cae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requests-unixsocket \
python3.11dist-requests-unixsocket \
python311-requests-unixsocket \
python3dist-requests-unixsocket"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python311-requests"

inherit rpm
