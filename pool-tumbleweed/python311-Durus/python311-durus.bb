SUMMARY = "A Python Object Database"
DESCRIPTION = "Serves and manages changes to persistent objects being used in \
multiple client processes."
LICENSE = "CNRI-Python"

PV = "4.2"

RPM_NAME = "python311-Durus-4.2-1.10.aarch64.rpm"
RPM_HASH = "cdcd8c931a2390de247d743a37227a6b28926a85dcde2262b51e30a850fe826af804e24cff7eb2e46d4dfcf9c5f205fcf6f67a8e8ac8138a0a886a16312b0fde"

RPROVIDES:${PN} += "python3.11dist-durus \
python311-Durus \
python3dist-durus"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
update-alternatives"

inherit rpm
