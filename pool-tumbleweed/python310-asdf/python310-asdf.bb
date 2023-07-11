SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python310-asdf-2.15.0-1.4.noarch.rpm"
RPM_HASH = "a96980818012e6d10caf74973d786ac3547a846f96cebe239caa6949701df679d0a38f039700bcc104890992843d4891abace496d65c718c40f92b4bb9135a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf \
python310-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "-python310-jsonschema >= 4.0.1 with python310-jsonschema < 4.18 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-asdf-standard \
python310-asdf-transform-schemas \
python310-asdf-unit-schemas \
python310-importlib-metadata \
python310-jmespath \
python310-numpy \
python310-packaging \
python310-semantic-version \
update-alternatives"

inherit rpm
