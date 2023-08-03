SUMMARY = "Documentation for OpenStack Freezer API client libary"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-freezerclient-doc-4.4.0-1.6.noarch.rpm"
RPM_HASH = "437db277c71a861591487a75f03490e452be344a93ba2082da70a229636e71532392add6eb5323faea8478103cbfa26ba1a69f780b2557920750a99bb919f975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-freezerclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
