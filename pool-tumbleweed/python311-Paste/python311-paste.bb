SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python311-Paste-3.5.2-3.1.noarch.rpm"
RPM_HASH = "99102f44fae93bfbe445c46450c2d321a9361429a969470df07d3f826732e221a818cd2d6d74b2d8d78fb3d5a5312d764fd5189e44118e6feb30afc49c7c8b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-paste \
python311-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
