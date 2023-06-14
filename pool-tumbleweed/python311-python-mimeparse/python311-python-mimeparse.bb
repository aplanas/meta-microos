SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python311-python-mimeparse-1.6.0-5.1.noarch.rpm"
RPM_HASH = "035f429fddf9558b8f9b76724d0353d9d703e31bce79c8bd7eaf550e5b3cb80fed75e9e0722cba3102ed7934a26a2f3ee279f9b88af34956d111eb4a56b74c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-mimeparse \
python311-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
