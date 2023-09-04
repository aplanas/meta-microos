SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.1"

RPM_NAME = "python311-asdf-2.15.1-1.1.noarch.rpm"
RPM_HASH = "588a669021bb48eea8a917acb7ef892015069412c4be3fdb69ab9aa6eb730ab1b95de03356d41dbb63c5f14a65e68f9c530533627130d79745fd4c55d460c6ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-asdf \
python3.11dist-asdf \
python311-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyYAML \
python311-asdf-standard \
python311-asdf-transform-schemas \
python311-asdf-unit-schemas \
python311-attrs \
python311-importlib-metadata \
python311-jmespath \
python311-jsonschema \
python311-numpy \
python311-packaging \
python311-semantic-version \
update-alternatives"

inherit rpm
