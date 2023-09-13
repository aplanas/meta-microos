SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python39-bottle-0.12.25-5.1.noarch.rpm"
RPM_HASH = "b1cf9660cfc798e69047cffa13ae128367f2f2967ddc010f081b695e58a532c678fbf719f9783873aca66bfad7a09d2f98c204b90eb669e47d5fcc79efe3a2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bottle \
python39-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
