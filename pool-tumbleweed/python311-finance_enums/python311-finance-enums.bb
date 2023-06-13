SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-finance_enums-0.1.0-2.7.noarch.rpm"
RPM_HASH = "78bb7d3f8f280b9a29f79f0606ad05353e9b42b2b67606969faf71764fad2fa41f33ee157a274d677a4e22218e179f3081f7f1b1b9f0229eb55e0ab5d569ccd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(finance-enums) \
python311-finance_enums \
python3dist(finance-enums)"

RDEPENDS:${PN} += "python(abi) \
python311-pandas"

inherit rpm
