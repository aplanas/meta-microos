SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python311-bottle-0.12.25-4.2.noarch.rpm"
RPM_HASH = "4f23b234234f3bd6234ec5b930fa5a2da7576faa15f5f5aef7a80749354dd5df97285b7b3cf528b99cceed86fab185e282b9080346e4f54e51f2b0deb15bd391"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bottle \
python3.11dist-bottle \
python311-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
