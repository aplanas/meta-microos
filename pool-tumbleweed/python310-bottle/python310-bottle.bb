SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python310-bottle-0.12.25-5.1.noarch.rpm"
RPM_HASH = "8af30853ed8b04331ea67cc1746d19acf7c0f56a8bd670e63c2fbaa2d6fc62bb8eb3a19c42aed66a89bf0f53a4e4d5d5b893de3ae463d3b84cccd9b69452d7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bottle \
python310-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
