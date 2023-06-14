SUMMARY = "Universal Binary JSON encoder/decoder"
DESCRIPTION = "This is a Python v3.2+ (and 2.7+) `Universal Binary JSON` \
encoder/decoder based on the `draft-12` specification."
LICENSE = "Apache-2.0"

PV = "0.16.1"

RPM_NAME = "python311-py-ubjson-0.16.1-1.11.aarch64.rpm"
RPM_HASH = "a3f872116cdfd22b0379cd2333df4d7819c00a61882d73fc998c644835991fd971287e24c5f2c624a6779a2c674dfed37d6c961e3d933ff9185ec875eb5e11ce"

RPROVIDES:${PN} += "python3.11dist-py-ubjson \
python311-py-ubjson \
python3dist-py-ubjson"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
