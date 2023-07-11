SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-python-mimeparse-1.6.0-5.2.noarch.rpm"
RPM_HASH = "be3d6fe4ec53cd66f67f5f189d9eebf89f235555e573dcdcb0c6cdd9202f4ab88ea5930eb5bcb23bcaccac2e590a1fe137e82b471f692394c9b5d5c7d8a38a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-mimeparse \
python310-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
