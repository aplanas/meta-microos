SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-python-consul-1.1.0-2.11.noarch.rpm"
RPM_HASH = "8bb7ae38385fa2f873f55f7873d0b5ae39e32419c502f78b00831d9896c213476c1facb3993acae93c3a2494cf1833fef56124dc7c3f080e6b916562f4a7859d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-consul \
python39-python-consul \
python3dist-python-consul"

RDEPENDS:${PN} += "python-abi \
python39-requests \
python39-six"

inherit rpm
