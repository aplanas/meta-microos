SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-gns3fy-0.8.0-1.3.noarch.rpm"
RPM_HASH = "f98ea265b202d8fe6d665bf09a77c28813c1af97234eeaea1bc79bb05511a7e061c841d9f9da0734604d639c0e73528a695ff54de8ee8c0ee249ca36bd0eff76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gns3fy) \
python311-gns3fy \
python3dist(gns3fy)"

RDEPENDS:${PN} += "python(abi) \
python311-pydantic \
python311-requests"

inherit rpm
