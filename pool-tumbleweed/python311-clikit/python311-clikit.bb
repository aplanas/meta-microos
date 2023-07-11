SUMMARY = "Helper to build testable command line interfaces"
DESCRIPTION = "CliKit is a group of utilities to build beautiful and testable \
command line interfaces."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-clikit-0.6.2-3.1.noarch.rpm"
RPM_HASH = "b5581ee469344c2052984bab60d2c2dac7c5e9dcf5808149d4f015564a8a27d1c23d04192fbf1ee4e581497d3045ab7780a06a8cb42cb16188dbc4fc6f822b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clikit \
python3.11dist-clikit \
python311-clikit \
python3dist-clikit"

RDEPENDS:${PN} += "python-abi \
python311-crashtest \
python311-pastel \
python311-pylev"

inherit rpm
