SUMMARY = "Documentation for OpenStack Mistral API client libary"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-mistralclient-doc-4.4.0-2.7.noarch.rpm"
RPM_HASH = "d34142314642a625f20152db9d7455475d970e4550095863629ee04b5fd369a7106220d0f9d9b2d3223fe7b082ae1693961bf2cf67f6f6cfc270598a9221a1c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mistralclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
