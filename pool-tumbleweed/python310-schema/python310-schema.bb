SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python310-schema-0.7.5-2.5.noarch.rpm"
RPM_HASH = "4754053db2869d50166ad8e6dbd374574ac1f6eda26e4cacabae7f551d91d8ec7bc0c26888cef75aacdb968ee3092fece3acb4dfbab27c5e274143ee0efa16d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-schema \
python310-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
