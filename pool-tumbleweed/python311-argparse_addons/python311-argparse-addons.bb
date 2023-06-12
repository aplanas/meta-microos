SUMMARY = "Additional argparse types and actions"
DESCRIPTION = "Additional argparse types and actions."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-argparse_addons-0.12.0-1.1.noarch.rpm"
RPM_HASH = "bd19d989ede9e73a9d083240415868da19d9341fc18b63d72e2bd56a447a61277a8128045e7565ac0e47728b552257b0cefa3a6814e852e4c999b705845a777e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(argparse-addons) \
python311-argparse_addons \
python3dist(argparse-addons)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
