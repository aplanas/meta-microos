SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.3"

RPM_NAME = "python310-Paste-3.5.3-1.1.noarch.rpm"
RPM_HASH = "f5370b40103353aab9eda7b7e9dbd8a4566321addf259f8bac360a1a33bbede5327fa091132b8268bc03c5f3c242ad75497b694cc5e8f6670ab38fb547f96dcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-paste \
python310-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python310-setuptools \
python310-six"

inherit rpm
