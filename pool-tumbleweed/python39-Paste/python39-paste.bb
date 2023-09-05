SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.3"

RPM_NAME = "python39-Paste-3.5.3-1.1.noarch.rpm"
RPM_HASH = "e9657bbd6be1def4a85ff3645318d42967e08ee798ad7e4e5d4ce3830e519dd2b9f1e20fbce428c71914d47dafe8496ea587a64bfbd4897332a131ded8cf7e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-paste \
python39-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-six"

inherit rpm
