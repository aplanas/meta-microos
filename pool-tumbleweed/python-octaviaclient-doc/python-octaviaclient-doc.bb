SUMMARY = "Documentation for OpenStack Octavia API Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python-octaviaclient-doc-2.5.0-1.7.noarch.rpm"
RPM_HASH = "909ad2203208f8f41d8287376d6aaa0528c4c4dead46cf045e69bcc406f2541fff816750568c78bd426f3dff701dc4d716333bee950d97c4ed10ac0d44a00177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-octaviaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
