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

RPM_NAME = "python-bottle-doc-0.12.25-4.1.noarch.rpm"
RPM_HASH = "23bda24ef76ab56c1076c88e4981a5beebb3648c3bbac0a07d447acc6a17d6c6995c121bad9396ebc8833f7da7eacf83d523562cb583471ab289105c6ee41901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bottle-doc \
python310-bottle-doc \
python311-bottle-doc \
python39-bottle-doc"

RDEPENDS:${PN} += ""

inherit rpm
