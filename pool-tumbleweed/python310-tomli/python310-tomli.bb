SUMMARY = "A lil' TOML parser"
DESCRIPTION = "Tomli is a Python library for parsing TOML"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-tomli-2.0.1-2.3.noarch.rpm"
RPM_HASH = "0ba36590a4faf122dc2f626445653352a806a47ec465a0784f2e7d4a5007dc9ab3d2dfd2a0e8ef16431390ef10d66ca614985e3be13ea8ce8dd43eeeaea3d563"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tomli \
python310-tomli \
python3dist-tomli"

RDEPENDS:${PN} += "python-abi"

inherit rpm
