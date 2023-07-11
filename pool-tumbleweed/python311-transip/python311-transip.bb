SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python311-transip-2.1.2-4.8.noarch.rpm"
RPM_HASH = "e9ba8b2323ba271d61636d8784f3808d973a104908a3632aa6a57693f3dfb57f2543d9077cda91104a542fbbe67a3f1c09549a92f032bdd9acd06af49d3e92ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-transip \
python3.11dist-transip \
python311-transip \
python3dist-transip"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-cryptography \
python311-requests \
python311-setuptools \
python311-suds \
update-alternatives"

inherit rpm
