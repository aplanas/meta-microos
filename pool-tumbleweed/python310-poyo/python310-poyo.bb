SUMMARY = "YAML Parser for Python"
DESCRIPTION = "A YAML Parser for Python. \
 \
Please note that Poyo supports only a chosen subset of the YAML format. \
 \
It can only read but not write and is not compatible with JSON. \
 \
Poyo does not allow deserialization of arbitrary Python objects. Supported \
types are str, bool, int, float, NoneType as well as dict and list values."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python310-poyo-0.5.0-2.1.noarch.rpm"
RPM_HASH = "6fdcb52e20180ffec88cc1d6f5f3b4c4d07db587b7052f85baa54b55333146639f299af40ba9cb9bc79548d503b47af0189c943c9a0dc8a7bf9e253ac087a8b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poyo \
python3.10dist-poyo \
python310-poyo \
python3dist-poyo"

RDEPENDS:${PN} += "python-abi"

inherit rpm
