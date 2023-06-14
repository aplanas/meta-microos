SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python39-transip-2.1.2-4.6.noarch.rpm"
RPM_HASH = "b6194e43827b13196884e3770415d8a8cc7b05f90e69bb74ca4471f0e87195dbbba93f94db6eb8655b9606b01eb80f77bb21d8dbc8789801158c91a45a7f20f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-transip \
python39-transip \
python3dist-transip"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-cryptography \
python39-requests \
python39-setuptools \
python39-suds \
update-alternatives"

inherit rpm
