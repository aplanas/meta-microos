SUMMARY = "Documentation for OpenStack Magnum API client libary"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python-magnumclient-doc-3.6.0-1.6.noarch.rpm"
RPM_HASH = "d1e0f453082ffee54c86e7b41011c6fb6785edcb62218a79cb23d1a9cb55aec0ac30ce0317d935cc726f3d753c5cd17e4750591cb77f3ebf32be9146cf4d4153"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magnumclient-doc"
RDEPENDS:${PN} += ""

inherit rpm
