SUMMARY = "Python tools to handle ASDF files"
DESCRIPTION = "The Advanced Scientific Data Format (ASDF) is a next-generation \
interchange format for scientific data. This package contains the \
Python implementation of the ASDF Standard."
LICENSE = "BSD-2-Clause & BSD-3-Clause"

PV = "2.15.0"

RPM_NAME = "python311-asdf-2.15.0-1.1.noarch.rpm"
RPM_HASH = "d6d38a33d4c0f49c1eb734f08675912dc69ab7eb6b3b0a5d515c175c0d723f2f040774f4849b6e217d5744b9086cd71815163c704df2256ce51452b906b7c291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-asdf \
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
