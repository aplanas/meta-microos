SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python39-asdf-2.15.0-1.1.noarch.rpm"
RPM_HASH = "4c0964385968df5dbce377a493e91823e1c8222fabc68fa61ca2a8b313e55984542570f67845f91f7ebef55bcb7ea16a7fc521e85b1d807a9e76b115753158a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(asdf) \
python39-asdf \
python3dist(asdf)"

RDEPENDS:${PN} += "(python39-jsonschema >= 4.0.1 with python39-jsonschema < 4.18) \
/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PyYAML \
python39-asdf-standard \
python39-asdf-transform-schemas \
python39-asdf-unit-schemas \
python39-importlib-metadata \
python39-jmespath \
python39-numpy \
python39-packaging \
python39-semantic_version \
update-alternatives"

inherit rpm
