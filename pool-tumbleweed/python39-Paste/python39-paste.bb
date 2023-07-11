SUMMARY = "Tools for using a Web Server Gateway Interface stack"
DESCRIPTION = "These provide several pieces of 'middleware' (or filters) that can be nested \
to build web applications.  Each piece of middleware uses the WSGI (PEP 333) \
interface, and should be compatible with other middleware based on those \
interfaces."
LICENSE = "MIT"

PV = "3.5.2"

RPM_NAME = "python39-Paste-3.5.2-3.3.noarch.rpm"
RPM_HASH = "32f04262413fa20ae8f3236f436333d86c0f863963ec117c7371bc717300ceecfae17b0be2dc265206b4bcdbc2232e29e94be07e5017cb60d5e74e7e5d36c1fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-paste \
python39-Paste \
python3dist-paste"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
