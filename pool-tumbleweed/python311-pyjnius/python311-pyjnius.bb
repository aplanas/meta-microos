SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python311-pyjnius-1.4.2-2.6.aarch64.rpm"
RPM_HASH = "5a2c4a31ddf78c539b02a2dc44e84c10da57910ec96378c1ca9c8207381ddd730e813224f23527790a4d34ef6c0b5cf411de59273f7050d23f6dc8311748284a"

RPROVIDES:${PN} += "python3-pyjnius \
python3.11dist-pyjnius \
python311-pyjnius \
python3dist-pyjnius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python311-Cython"

inherit rpm
