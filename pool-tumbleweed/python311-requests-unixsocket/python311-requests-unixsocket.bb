SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-requests-unixsocket-0.3.0-2.1.noarch.rpm"
RPM_HASH = "18cba8a8eec835777188054c1405768036b8cfed2f9d9c372581bc1107a69e00646d8dd5c2520462aa6410234194bf8596063680063e60a07a5d0f803aa5c6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(requests-unixsocket) \
python311-requests-unixsocket \
python3dist(requests-unixsocket)"

RDEPENDS:${PN} += "/usr/bin/env \
python(abi) \
python311-requests"

inherit rpm
