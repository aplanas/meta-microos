SUMMARY = "Documentation for OpenStack Mistral API client libary"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-mistralclient-doc-4.4.0-2.6.noarch.rpm"
RPM_HASH = "94b6b349e600e8ce81ca348f14047eba20a0749fdf1a070aa0115a9d658b16cbcfb4de104c44523b064e54fa8caf308159a8c8788d211b4f9e5f5656d3d390f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-mistralclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
