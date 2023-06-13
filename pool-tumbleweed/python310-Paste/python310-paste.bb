SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python310-Paste-3.5.2-3.1.noarch.rpm"
RPM_HASH = "8b54d729e76650cb3d54aefd5361446eacaa13d1fa987b10766b82a7f1bc4ef44e46b6f89628d3b6937f0cea3d933a4af8ed2ff0705ab43d7b9fc46751ff1985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Paste \
python3.10dist(paste) \
python310-Paste \
python3dist(paste)"

RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
