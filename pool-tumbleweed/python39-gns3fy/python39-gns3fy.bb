SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python39-gns3fy-0.8.0-1.3.noarch.rpm"
RPM_HASH = "b57a4b53898fdf5687812c6077def14259a8a4725a25a96410f8411b442d5e2563e322116132bb6f0ac98973437d93dc1fa54640df362e56a855ae5de7240c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-gns3fy \
python39-gns3fy \
python3dist-gns3fy"

RDEPENDS:${PN} += "python-abi \
python39-pydantic \
python39-requests"

inherit rpm
