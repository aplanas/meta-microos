SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python310-bottle-0.12.25-4.1.noarch.rpm"
RPM_HASH = "bf5aebc745b553fbef8507ed4ebbcea1f73c711394f51f111cfbd3c1d015b6820493a61a0e2bb80cfa3d4cac56aeeb26afd9f5c86cbca654de901f3464ee4221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bottle \
python3.10dist-bottle \
python310-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
