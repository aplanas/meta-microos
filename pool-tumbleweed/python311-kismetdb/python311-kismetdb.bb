SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python311-kismetdb-2019.05.05-2.14.noarch.rpm"
RPM_HASH = "16d3edc9a756bf91da9746a151e01c7aee9ca628527e9096f7a8b67c2c011ecb377100e25f4b3381193595e4d91aee1e845beeea8e0a15472ed9bab066165cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-kismetdb \
python3.11dist-kismetdb \
python311-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-python-dateutil \
python311-simplekml \
update-alternatives"

inherit rpm
