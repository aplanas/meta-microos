SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python39-bottle-0.12.25-4.2.noarch.rpm"
RPM_HASH = "4644d0fb8dc941bbbe2d62576e2cca74eac8100cd8f2a584bf2d3e38c2e1a66e029551ec9c85c5ff151f5837848a3d4aa869655acd4e293eff6bb4bccae1faaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bottle \
python39-bottle \
python3dist-bottle"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
