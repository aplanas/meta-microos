SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python310-Paste-3.5.2-3.3.noarch.rpm"
RPM_HASH = "5a175abafd4186b443f942a592b0ff5f8f65bbdd5f7a549eefe1af42b7b987032cdcb315fee825aafef361df46b2479371476f7d81f57a2c3ee6f50176012f43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-paste \
python310-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
