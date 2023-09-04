SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.2"

RPM_NAME = "python311-referencing-0.30.2-1.1.noarch.rpm"
RPM_HASH = "fc929134f652b18f55d08c5d1971fb7ca5e81f110dc73ba8a2c217fe91f3cdf280595b94069ba3310e3c2f55c929f9168727a8e215eb904291f312a95515b44c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.11dist-referencing \
python311-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-rpds-py"

inherit rpm
