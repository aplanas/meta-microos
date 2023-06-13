SUMMARY = "Documentation for OpenStack Masakari API client libary"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python-masakariclient-doc-7.1.0-1.4.noarch.rpm"
RPM_HASH = "c931863d71a249bfb6319b45bf456457014909b180f91c9b3f6eb2fdc93a09b17bdd6f49b0a4787687c00b00b4c8ab2cb629ebfe26abb506bb307ad5b8f954fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-masakariclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
