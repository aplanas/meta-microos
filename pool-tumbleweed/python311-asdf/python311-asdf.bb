SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python311-asdf-2.15.0-1.4.noarch.rpm"
RPM_HASH = "3de5c1b4fdcd0d56a70ba943cfcf26d147c4f36b0a17a8e4f7937f8f6c18d91dbb539b3fce5b747bb64956514726b76d968dc228be52c457e47d4a8bb1ae3416"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf \
python3.11dist-asdf \
python311-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "-python311-jsonschema >= 4.0.1 with python311-jsonschema < 4.18 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-asdf-standard \
python311-asdf-transform-schemas \
python311-asdf-unit-schemas \
python311-importlib-metadata \
python311-jmespath \
python311-numpy \
python311-packaging \
python311-semantic-version \
update-alternatives"

inherit rpm
