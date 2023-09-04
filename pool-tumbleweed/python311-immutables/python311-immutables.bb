SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.19"

RPM_NAME = "python311-immutables-0.19-4.1.aarch64.rpm"
RPM_HASH = "aca6cc96b4ad7f847974e367dc449bd9d65d5a5d1621894dc7453f3e3303706e28881c8de999128b3c40c32d7b99582a939b7043170bc1cdb09964028d83c40e"

RPROVIDES:${PN} += "python3-immutables \
python3.11dist-immutables \
python311-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
