SUMMARY = "Documentation for python-Flask"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-Flask."
LICENSE = "BSD-3-Clause"

PV = "2.2.5"

RPM_NAME = "python310-Flask-doc-2.2.5-1.3.noarch.rpm"
RPM_HASH = "531594428d6c9623a502cc872212f5427bafd489aeb39bcc1e579ecdc4747285f10301d0fc921802e0f80b3899afc4f1bd92915fde15e5fe9969d247d503b4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Flask-doc"

RDEPENDS:${PN} += "python310-Flask"

inherit rpm
