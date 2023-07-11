SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python39-lazr.uri-1.0.6-1.10.noarch.rpm"
RPM_HASH = "9f1a201409d6e5b2c8a75e435ffbc5b1569b08c82286749b3be5f0029f2da3527679c13cd6c8964db08ff1eee0a29ea50d0b71cf3bcb72e341f9848ceb9f8dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazr.uri \
python39-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
