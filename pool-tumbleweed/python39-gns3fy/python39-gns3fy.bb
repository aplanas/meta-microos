SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-gns3fy-0.8.0-2.1.noarch.rpm"
RPM_HASH = "9918d20c581dc9a9a7bb4db87280153194a01ff052cedbef55824c268a3f2a7b8cb7fb9569e79b2183a44d91a19f1e1e3b5d0b3c1f628df4ceeb74983961780b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gns3fy \
python39-gns3fy \
python3dist-gns3fy"

RDEPENDS:${PN} += "python-abi \
python39-pydantic \
python39-requests"

inherit rpm
