SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python39-Paste-3.5.2-3.1.noarch.rpm"
RPM_HASH = "24b1f5ee39549d5540ea2eb3b6cadbc2172f7213e92209c38482cd135d2d5e6e78ee7aba9a4299546a81b4251fdaa4aa70f6925d8306d2ab8b59f562baa970b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(paste) \
python39-Paste \
python3dist(paste)"

RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
