SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python310-isbnlib-3.10.12-1.4.noarch.rpm"
RPM_HASH = "a90b2a840b11027402d23c86f1ff68cb11b7a850963b927630ad6b04599e3e0b4c0efdbc7c22946f03883bf10b9434535676f8e53c59f52d62fc6a49eee58ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isbnlib \
python3.10dist(isbnlib) \
python310-isbnlib \
python3dist(isbnlib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
