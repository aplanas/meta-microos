SUMMARY = "Documentation for OpenStack Masakari API client libary"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python-masakariclient-doc-7.1.0-1.5.noarch.rpm"
RPM_HASH = "cf09d0595ac7fbdf98b078629bffc9c3c23bc0a4798d29b5dc8c1b681ef8e2c818d0827ab61fa3d7bd95e6c8b7494c27777109fd20a044be331642856fffe7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-masakariclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
