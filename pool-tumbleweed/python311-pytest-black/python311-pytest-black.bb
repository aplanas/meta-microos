SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python311-pytest-black-0.3.12-2.12.noarch.rpm"
RPM_HASH = "a30b39a6196859597f9428b8816d89c9833413116092aa695faf1bbe2104b311131d4b0dd5c4b1b6197a7a6c373c9afb57719cd31803d5ac4518455c677c6d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-black \
python3.11dist-pytest-black \
python311-pytest-black \
python3dist-pytest-black"

RDEPENDS:${PN} += "python-abi \
python311-black \
python311-pytest \
python311-toml"

inherit rpm
