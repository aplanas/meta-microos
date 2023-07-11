SUMMARY = "Basic functions for parsing and matching mime-type names"
DESCRIPTION = "This module provides basic functions for handling mime-types. It can handle \
matching mime-types against a list of media-ranges. See section 14.1 of \
the HTTP specification [RFC 2616] for a complete explanation."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python39-python-mimeparse-1.6.0-5.2.noarch.rpm"
RPM_HASH = "8cf53e4654429212b581bc491db8a7760207df2520dffba0e26c26fa2b1800b373edd2267c6fc8537cf163c6b640b98e82b45c8c5ff675cd3267afc1a617686d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-mimeparse \
python39-python-mimeparse \
python3dist-python-mimeparse"

RDEPENDS:${PN} += "python-abi"

inherit rpm
