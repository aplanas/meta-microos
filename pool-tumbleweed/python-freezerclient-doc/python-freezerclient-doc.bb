SUMMARY = "Documentation for OpenStack Freezer API client libary"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python-freezerclient-doc-4.4.0-1.5.noarch.rpm"
RPM_HASH = "f93d443d1e5855def08c46b77e4c9c2255884b63eb94800ad10ecb4f8f22c682ee7d563d244911d8d0caca829edfae2e72f32f7cd91ece02c33c784408bf16b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-freezerclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
