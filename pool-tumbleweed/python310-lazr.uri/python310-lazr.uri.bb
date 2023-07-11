SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python310-lazr.uri-1.0.6-1.10.noarch.rpm"
RPM_HASH = "b7420446acc5b0aed8c77c5f0aeebc55736423d4208a23cae170957b4f1f9594d1ce7b605de8c774ce137070ae86078e5458ccbf6f13da5e5b940ad2ad5de283"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-lazr.uri \
python310-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
