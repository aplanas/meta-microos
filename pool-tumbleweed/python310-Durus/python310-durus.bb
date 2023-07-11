SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python310-Durus-4.2-1.12.aarch64.rpm"
RPM_HASH = "36a18ad8683e2d99db43c8cadacb17344fadab00073f82d22c4d4de0d537889e30bdc7723be4468907e4669058bef0c5e975dcaa1d73588c051776b2335d3f89"

RPROVIDES:${PN} += "python3.10dist-durus \
python310-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
