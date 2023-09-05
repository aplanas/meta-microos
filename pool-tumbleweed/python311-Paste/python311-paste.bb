SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.3"

RPM_NAME = "python311-Paste-3.5.3-1.1.noarch.rpm"
RPM_HASH = "53a9241c386d2530c306f88d0425900f0dc2a742ef16436515fcdff1ab8c7453a22c3da0cc6d2d5c083b9f2ae29dbfa1c283877531690017e6bac4c0f5fb37dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Paste \
python3.11dist-paste \
python311-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python311-setuptools \
python311-six"

inherit rpm
