SUMMARY = "U2F host library for interacting with a U2F device over USB"
DESCRIPTION = "U2F host library for interacting with a U2F device over USB."
LICENSE = "Apache-2.0"

PV = "0.1.5a"

RPM_NAME = "python39-pyu2f-0.1.5a-5.1.noarch.rpm"
RPM_HASH = "54f02bb783b63c2c11e06ec79f486f3f2c01ad9ad5eaca7e423cf7e698cf56746ba2ea589cc8304d7a4b6f6f41c84583bacac1eaee9580c83cba2c77bc624009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyu2f \
python39-pyu2f \
python3dist-pyu2f"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
