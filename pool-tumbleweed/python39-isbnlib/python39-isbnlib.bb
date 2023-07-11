SUMMARY = "Extract, clean, transform, hyphenate and metadata for ISBNs"
DESCRIPTION = "Extract, clean, transform, hyphenate and metadata for ISBNs \
(International Standard Book Number)."
LICENSE = "LGPL-3.0-only"

PV = "3.10.12"

RPM_NAME = "python39-isbnlib-3.10.12-1.6.noarch.rpm"
RPM_HASH = "3379f805d00ed6809d901932652e075ec9dc116eaaf8d9c3ef7361fabbe15e1fc8d911958629eb0815b955190ff4c3625f0670479f2ca2165e0225e1125efe8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-isbnlib \
python39-isbnlib \
python3dist-isbnlib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
