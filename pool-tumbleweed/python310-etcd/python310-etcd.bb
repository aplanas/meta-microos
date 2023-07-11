SUMMARY = "A python client for etcd"
DESCRIPTION = "A python client for etcd cluster"
LICENSE = "MIT"

PV = "0.4.5"

RPM_NAME = "python310-etcd-0.4.5-4.13.noarch.rpm"
RPM_HASH = "2fcf95d9d80df2e9eaa066678f98306d9e18b37e005a226728de21d112762730de7321aaf573d3d74e3bda951bd5c2dbfb3371cb6afae04d90b8a47b7a276c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-etcd \
python310-etcd \
python3dist-python-etcd"

RDEPENDS:${PN} += "python-abi \
python310-dnspython \
python310-urllib3"

inherit rpm
