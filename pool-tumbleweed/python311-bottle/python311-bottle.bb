SUMMARY = "WSGI framework for small web applications"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python311-bottle-0.12.25-5.1.noarch.rpm"
RPM_HASH = "01594b376abc0cc561d22e8460fe73eabf3469807b6b53d2862e9182165e651f0dc30572933bac91bc1bdff83a4b5bebade7a68c181fe8198d1290c33af32155"
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
