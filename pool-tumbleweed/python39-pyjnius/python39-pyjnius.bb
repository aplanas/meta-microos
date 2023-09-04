SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python39-pyjnius-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "442efc72857446028ceabb9b0130e82283e08f1b4e95bd34e8b3adcbebef0dbef5c0ca1a3accef9fb32d1c303da95672182610b4514cb6351a391199d15b94a2"

RPROVIDES:${PN} += "python3.9dist-pyjnius \
python39-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-Cython"

inherit rpm
