SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-python-mimeparse-1.6.0-5.1.noarch.rpm"
RPM_HASH = "a389513e3d908cc8f36f68c281610405957779221bafcc5cd70ddc29aaf682bffacae65008bcca54e4f6031c966da1fd68fa0a73c8731ae0d17151c78d5336a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mimeparse \
python3.10dist(python-mimeparse) \
python310-python-mimeparse \
python3dist(python-mimeparse)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
