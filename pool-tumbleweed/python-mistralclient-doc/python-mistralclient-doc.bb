SUMMARY = "Documentation for OpenStack Mistral API client libary"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-mistralclient-doc-4.4.0-2.5.noarch.rpm"
RPM_HASH = "d7a03dfc5be737554c9412490a716166cf8767ea46977a8883e1b09ed3268658e4add71b0394aefd8f542e540416696ad2bdb6c6f5103d962e711172ffc9fc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mistralclient-doc"
RDEPENDS:${PN} += ""

inherit rpm
