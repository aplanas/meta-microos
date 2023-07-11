SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python39-asdf-2.15.0-1.4.noarch.rpm"
RPM_HASH = "87883dd2bb7ea46cba44b0c7d8fb429b888a785f6acf8bfe1b8a73d2419e0be81124a1d1683dde300d956e2e939a993a87dd22114011f51cc126f25845b7a42a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-asdf \
python39-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "-python39-jsonschema >= 4.0.1 with python39-jsonschema < 4.18 \
/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyYAML \
python39-asdf-standard \
python39-asdf-transform-schemas \
python39-asdf-unit-schemas \
python39-importlib-metadata \
python39-jmespath \
python39-numpy \
python39-packaging \
python39-semantic-version \
update-alternatives"

inherit rpm
