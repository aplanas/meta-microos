SUMMARY = "Data validation and settings management using python type hinting"
DESCRIPTION = "Data validation and settings management using Python type hinting."
LICENSE = "MIT"

PV = "1.10.9"

RPM_NAME = "python311-pydantic-1.10.9-1.1.noarch.rpm"
RPM_HASH = "7ac58a420bc03e0bb16ddbef96f2f3caea24e0f126ac8eddd871b2c6b269e72879f8a0fc2cbe6106a8b09a1b5fc5401c607578d7fc050ceec608f090919e45f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydantic \
python3.11dist-pydantic \
python311-pydantic \
python3dist-pydantic"

RDEPENDS:${PN} += "python-abi \
python311-typing-extensions"

inherit rpm
