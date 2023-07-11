SUMMARY = "Data validation library"
DESCRIPTION = "Schema is a library for validating Python data structures, such as those \
obtained from config-files, forms, external services or command-line \
parsing, converted from JSON/YAML (or something else) to Python data-types."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "python311-schema-0.7.5-2.5.noarch.rpm"
RPM_HASH = "7a945b9de3fd71c99200d70690521f7de921d80a7589b5d7b10148a8c68a13342d39bbc3158b509a507e3da1f2c41bdafa5e3a1ff5a331e097434e1103cee43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-schema \
python3.11dist-schema \
python311-schema \
python3dist-schema"

RDEPENDS:${PN} += "python-abi"

inherit rpm
