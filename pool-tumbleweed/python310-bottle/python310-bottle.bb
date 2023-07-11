SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python310-bottle-0.12.25-4.2.noarch.rpm"
RPM_HASH = "868cb31d348210a960484f1da313e951bf03cac7de47e6aae51cc2044e903f32ec701b4ff3253769dcf64b5240dfbe132c8772d7190a87d78c2bb603c1193d01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bottle \
python310-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
