SUMMARY = "A python wrapper for the Kismet database"
DESCRIPTION = "Kismet database wrapper."
LICENSE = "GPL-2.0-only"

PV = "2019.05.05"

RPM_NAME = "python310-kismetdb-2019.05.05-2.14.noarch.rpm"
RPM_HASH = "45cd757e3dd00586a7b4287038cb3fe30f0cd4d36d1d300fc532ce81491041e1c3070ff5e5b85898fcc7c3baa28d9136eccf0b47601cb69c1fa4c5c4cae6c9b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-kismetdb \
python310-kismetdb \
python3dist-kismetdb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-python-dateutil \
python310-simplekml \
update-alternatives"

inherit rpm
