SUMMARY = "Python wrapper around GNS3 Server API"
DESCRIPTION = "Python wrapper around GNS3 Server API. Its main objective is to \
interact with the GNS3 server in a programatic way, so it can \
be integrated with the likes of Ansible, docker and scripts. \
https://gns3-server.readthedocs.io/en/latest/"
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "python311-gns3fy-0.8.0-2.1.noarch.rpm"
RPM_HASH = "b14438d175d528c7da3a52244aa3ab04ac36b1be330cc3dfbbf3cdf0e353d85dc507f5b936987989ca1c9e94758b320ddbd1fabb203e0173e24a9412a16699ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gns3fy \
python3.11dist-gns3fy \
python311-gns3fy \
python3dist-gns3fy"

RDEPENDS:${PN} += "python-abi \
python311-pydantic \
python311-requests"

inherit rpm
