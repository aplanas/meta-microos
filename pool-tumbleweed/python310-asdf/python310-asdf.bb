SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.1"

RPM_NAME = "python310-asdf-2.15.1-1.1.noarch.rpm"
RPM_HASH = "15d149ad8a7c3dac8f6d3326b0f416d24dc74a20a7c184b894f1f0e7d67378b02d8a4921a1bc0c8ccd78f202fcd102351d1960fb8ebd0c46829f05fb4e11fe99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-asdf \
python310-asdf \
python3dist-asdf"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyYAML \
python310-asdf-standard \
python310-asdf-transform-schemas \
python310-asdf-unit-schemas \
python310-attrs \
python310-importlib-metadata \
python310-jmespath \
python310-jsonschema \
python310-numpy \
python310-packaging \
python310-semantic-version \
update-alternatives"

inherit rpm
