SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python39-etcd-0.4.5-4.11.noarch.rpm"
RPM_HASH = "33b48e4c49a4ae994ccd16d7620b40edf535dfb0d765d421775a131cb3f7f1db4c55e7cc861e44e9f6bb16d6aa7d6f24210a851f6b38550fbc3503c0612e3e5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-etcd) \
python39-etcd \
python3dist(python-etcd)"

RDEPENDS:${PN} += "python(abi) \
python39-dnspython \
python39-urllib3"

inherit rpm
