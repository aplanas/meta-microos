SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python311-schema-0.7.5-2.3.noarch.rpm"
RPM_HASH = "b63668c1f02e9b91cf76ec646ebd2674473ed436a11852350670914e0f3518e3402d5b409f00717aa843bfbbae46bef6691a49644c460df705957c8f095bfadd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-schema \
python311-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
