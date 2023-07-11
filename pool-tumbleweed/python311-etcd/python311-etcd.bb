SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python311-etcd-0.4.5-4.13.noarch.rpm"
RPM_HASH = "eeee2f10978f90833d16c399f3d172e83ef56c84057b7623d988de60dbebed533abb3161b4d2bd093a56b96f4d3fde906b1b2ad941368f36410a63935f9c4f9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-etcd \
python3.11dist-python-etcd \
python311-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python311-dnspython \
python311-urllib3"

inherit rpm
