SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.1"

RPM_NAME = "python39-asdf-2.15.1-1.1.noarch.rpm"
RPM_HASH = "86a31f4b707d4552053ca8e18753a2cd989adade98adbc26082fb6f21bcf289d3d4d3e5d0988b5eaa5e1ab7914ff4ca306e0c4342b7a0c8bee1106794a62ec20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf \
python39-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-asdf-standard \
python39-asdf-transform-schemas \
python39-asdf-unit-schemas \
python39-attrs \
python39-importlib-metadata \
python39-jmespath \
python39-jsonschema \
python39-numpy \
python39-packaging \
python39-semantic-version \
update-alternatives"

inherit rpm
