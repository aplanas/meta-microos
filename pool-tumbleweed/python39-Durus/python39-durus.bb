SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python39-Durus-4.2-1.12.aarch64.rpm"
RPM_HASH = "2c206f54386493945c39c9fbf408256a04733d3eb647a447fd2f3c67011404bdf2fe39d5951ca63fc0f3ef07b3fba938e3f1abfed2da1f87ae7da568c6d6ed22"

RPROVIDES:${PN} += "python3.9dist-durus \
python39-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
