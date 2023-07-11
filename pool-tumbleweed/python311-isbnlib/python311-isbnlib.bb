SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python311-isbnlib-3.10.12-1.6.noarch.rpm"
RPM_HASH = "40c84d6d77b1eb4ae51cc6014f17b55759bfdec540b7a9b797b03622fc2fac80b5c2367b164e961cbc121fdee588e69a9b4a7589f3c7e28660cc2438e1bccc3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isbnlib \
python3.11dist-isbnlib \
python311-isbnlib \
python3dist-isbnlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
