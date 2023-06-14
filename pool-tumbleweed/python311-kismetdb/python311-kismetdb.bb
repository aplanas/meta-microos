SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python311-kismetdb-2019.05.05-2.13.noarch.rpm"
RPM_HASH = "f1fb3a208d193d8ac7fd9a6a47a35401a39e0f0995ac17b195d9ceaeee2cd6aed8870cdab4845fe49717897f26ebaae9c1710309b18ecb6b81aca4d69f1beec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-kismetdb \
python311-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-python-dateutil \
python311-simplekml \
update-alternatives"

inherit rpm
