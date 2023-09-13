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

RPM_NAME = "python-bottle-doc-0.12.25-5.1.noarch.rpm"
RPM_HASH = "aa6c6c58090dfa7ac1c0ffa665ff8b1646605bd3168aad92f65de070b9808f75b87f989d3656fba57fee976eeb08e64d721d12182284979f4c7327f921754fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bottle-doc \
python310-bottle-doc \
python311-bottle-doc \
python39-bottle-doc"

RDEPENDS:${PN} += ""

inherit rpm
