SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python39-schema-0.7.5-2.5.noarch.rpm"
RPM_HASH = "a1b6ed1840b65858ffc43d375b6756ca99226b8f7f20eb7f9f465255b6826a0becd74f79d8193dc018a4822664e8e129fd5512c53e5558b9cb70ffde8a6824f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-schema \
python39-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
