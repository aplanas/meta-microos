SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-gns3fy-0.8.0-2.1.noarch.rpm"
RPM_HASH = "7d1dea03a8c063342dad7f209df1c4feb2e6a22b3568e45d4f477b1bc9b7c4d416c324714f6dd24052a537d3d7835952b0612d5cad545c1e77048edecc367e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-gns3fy \
python310-gns3fy \
python3dist-gns3fy"

RDEPENDS:${PN} += "python-abi \
python310-pydantic \
python310-requests"

inherit rpm
