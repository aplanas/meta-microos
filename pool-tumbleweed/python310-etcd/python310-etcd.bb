SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-etcd-0.4.5-4.11.noarch.rpm"
RPM_HASH = "f358fd277bb7d3c8190ec2a10c39a15bfdb019e1ca80242fc08f73305f4f6c6b99faffbb1850c16823c50b415b7d37daef9add9481b34e946682c9632879379b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-etcd \
python3.10dist-python-etcd \
python310-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python310-dnspython \
python310-urllib3"

inherit rpm
