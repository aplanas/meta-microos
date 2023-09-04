SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python311-pyjnius-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "965605ebbb0a9be6b22ef8f8076e4e631c814d8a17d48a0b99290ccda38feb66600d8180e77d782d6347ed3aea72c2ea366cdbee7eeabf5f95a95eb27453fa60"

RPROVIDES:${PN} += "python3-pyjnius \
python3.11dist-pyjnius \
python311-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Cython"

inherit rpm
