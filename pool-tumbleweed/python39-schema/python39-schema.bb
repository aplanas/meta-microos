SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python39-schema-0.7.5-2.3.noarch.rpm"
RPM_HASH = "51c69bf8e6fe58e3daa31e8f0d470bd47ddae7902dba9995231ddf59f15b21218a80dd379832c1ca472852ad22959091f65bf89047b543413cef97db7fed3a03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-schema \
python39-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
