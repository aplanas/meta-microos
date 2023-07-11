SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-python-mimeparse-1.6.0-5.2.noarch.rpm"
RPM_HASH = "d1d174228a2d8c0133cb017d80fd4c835cc86c7dd740db21d30dbd35912b59f71936b9a802b7c0deddfe0b25ef02e4d69c39aa9feb275f584c79ce0bbb98b288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-mimeparse \
python3.11dist-python-mimeparse \
python311-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
