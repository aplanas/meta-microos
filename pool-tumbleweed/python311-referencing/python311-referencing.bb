SUMMARY = "JSON Referencing + Python"
DESCRIPTION = "JSON Referencing + Python"
LICENSE = "MIT"

PV = "0.30.0"

RPM_NAME = "python311-referencing-0.30.0-1.1.noarch.rpm"
RPM_HASH = "ecf55da91f28299accded3ef34cd774a06ae1e8e81100ff5108f9c74c97ca1d5150f04deade170652100f1099b1d8f27d6a4d74bb090cf992c3ee53bb6cfb7d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-referencing \
python3.11dist-referencing \
python311-referencing \
python3dist-referencing"

RDEPENDS:${PN} += "python-abi \
python311-attrs \
python311-rpds-py"

inherit rpm
