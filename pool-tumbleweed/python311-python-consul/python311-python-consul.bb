SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-python-consul-1.1.0-2.11.noarch.rpm"
RPM_HASH = "2747e8476379c00f248a9be1d9473f64388ba79f2cfad0bb8c29e663558bef17afb3838ec127f8b2373ef12c8516df0e8e35b164e0325103e8c6fe4f7c1b8d16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-consul \
python3.11dist-python-consul \
python311-python-consul \
python3dist-python-consul"

RDEPENDS:${PN} += "python-abi \
python311-requests \
python311-six"

inherit rpm
