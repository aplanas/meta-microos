SUMMARY = "Code for parsing and dealing with URI"
DESCRIPTION = "The lazr.uri package includes code for parsing and dealing with URIs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.6"

RPM_NAME = "python39-lazr.uri-1.0.6-1.8.noarch.rpm"
RPM_HASH = "f5134a388549fd506d3267f7c95dc65efafbc25deedf5b322bf948f897fd213259b4f80647968b54cbcc598b120a16d0889233779a392e28173348acc9c70bcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-lazr.uri \
python39-lazr.uri \
python3dist-lazr.uri"

RDEPENDS:${PN} += "python-abi"

inherit rpm
