SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python311-Durus-4.2-1.12.aarch64.rpm"
RPM_HASH = "a72b41c680b1cf859a81a09d11f1fc3f7336528218a8abf616c6ddf1e2f8461dcf5beb07b59698c6270226a685e6c9cdbee750d0df0a46fddf14410eb102493e"

RPROVIDES:${PN} += "python3-Durus \
python3.11dist-durus \
python311-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
