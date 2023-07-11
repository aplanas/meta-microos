SUMMARY = "Documentation for python-bottle"
DESCRIPTION = "Bottle is a micro-framework for small web applications. It offers \
request dispatching (routes) with URL parameter support, templates, a \
built-in HTTP server, and adapters for many third party WSGI/HTTP \
servers and template engines. This is all in a single file and with \
no dependencies other than the Python Standard Library. \
 \
This subpackage contains the PDF documentation for python-bottle."
LICENSE = "MIT"

PV = "0.12.25"

RPM_NAME = "python-bottle-doc-0.12.25-4.2.noarch.rpm"
RPM_HASH = "1c78198f847c825fac18fcfb9b134760806fc9f13896e667338b5328116447ea7758d65776d9151cdb7c9804a4b332664eae9a13223024ea578e3f724b39e957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bottle-doc \
python310-bottle-doc \
python311-bottle-doc \
python39-bottle-doc"

RDEPENDS:${PN} += ""

inherit rpm
