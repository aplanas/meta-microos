SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python310-asdf-2.15.0-1.1.noarch.rpm"
RPM_HASH = "36e29cf3b0e347bd1dc903d4b01167375d8a7c28ab5c886e07118655e63ceda46f6cdda67f633f9798576898262fc7821d6da6475975f1cc4a4244e8f1c9ff90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf \
python3.10dist(asdf) \
python310-asdf \
python3dist(asdf)"

RDEPENDS:${PN} += "(python310-jsonschema >= 4.0.1 with python310-jsonschema < 4.18) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyYAML \
python310-asdf-standard \
python310-asdf-transform-schemas \
python310-asdf-unit-schemas \
python310-importlib-metadata \
python310-jmespath \
python310-numpy \
python310-packaging \
python310-semantic_version \
update-alternatives"

inherit rpm
