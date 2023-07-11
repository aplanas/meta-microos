SUMMARY = "UNIX domain socket backend for python-requests"
DESCRIPTION = "With this module, python-requests is enhanced by the ability to talk \
HTTP via a UNIX domain socket."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python310-requests-unixsocket-0.3.0-3.3.noarch.rpm"
RPM_HASH = "91b91dea9e68ec197ee71a6443570270b30e4dac7dd11c46dbcd4f2e21058a10279e408bf07201b156b29fbd1f80d78e37272bf9274ed17ebd0d749011b49da8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-requests-unixsocket \
python310-requests-unixsocket \
python3dist-requests-unixsocket"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi \
python310-requests"

inherit rpm
