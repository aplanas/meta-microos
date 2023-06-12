SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python311-transip-2.1.2-4.6.noarch.rpm"
RPM_HASH = "abfa22365a55cb32e667705431849e41de3cdf8f70a12a82b4b4a5c14b821e39838ab2feb9ce40d37fad3712b068df5482d6dea928b987efb3245f1f6d10a5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(transip) \
python311-transip \
python3dist(transip)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-cryptography \
python311-requests \
python311-setuptools \
python311-suds \
update-alternatives"

inherit rpm
