SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python39-digitalocean-1.17.0-1.7.noarch.rpm"
RPM_HASH = "c591db5d0d52a6973b7f2ca27d63c07f6826ca59f41bf620428e2173b1c4a7d61727d1a57a8b2707348b227503e1d7b650335a98534bbbc522cf90181309e6b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-digitalocean \
python39-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python39-jsonpickle \
python39-pytest \
python39-requests \
python39-responses"

inherit rpm
