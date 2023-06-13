SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python310-gns3fy-0.8.0-1.3.noarch.rpm"
RPM_HASH = "7a673f2ef5099fa3b74fa25b1965dc92ddf02e07f001c193e6fef366d694e930ac216958d7e3d05dab07ceb6b80d53dfb226e21474eade29e40386ae0b89f849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gns3fy \
python3.10dist(gns3fy) \
python310-gns3fy \
python3dist(gns3fy)"

RDEPENDS:${PN} += "python(abi) \
python310-pydantic \
python310-requests"

inherit rpm
