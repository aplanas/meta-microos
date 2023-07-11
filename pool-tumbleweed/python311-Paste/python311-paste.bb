SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python311-Paste-3.5.2-3.3.noarch.rpm"
RPM_HASH = "641313bed0e041a1ee081f6e359515badf565743ec820533b513c1f662bdee41478aee847417d45f0d174ee8edcd5c24be492612f61722c8955726926925239a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Paste \
python3.11dist-paste \
python311-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
