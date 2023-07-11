SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python39-transip-2.1.2-4.8.noarch.rpm"
RPM_HASH = "f2fdb70c3bd4ede095942d3cb6299a7cb8eefc2ec755c3a5128d96a734b614ac01244c5b0e944fa8c41c8f42e19e4292fca46c7bdd13e01fb8addf58ce937f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-transip \
python39-transip \
python3dist-transip"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-cryptography \
python39-requests \
python39-setuptools \
python39-suds \
update-alternatives"

inherit rpm
