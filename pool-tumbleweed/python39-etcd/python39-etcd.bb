SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-etcd-0.4.5-4.13.noarch.rpm"
RPM_HASH = "5087a8ac9fa49dd728f06d7faf878075c6f6dd81833dafb1ed0cfb99bf45cc5b15a92633317f383ab09f59bdd0520920f02080f6b35d0e3323ddb0f5e75180f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-etcd \
python39-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python39-dnspython \
python39-urllib3"

inherit rpm
