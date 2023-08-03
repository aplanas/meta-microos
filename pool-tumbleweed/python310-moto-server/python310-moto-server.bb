SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.13"

RPM_NAME = "python310-moto-server-4.1.13-1.1.noarch.rpm"
RPM_HASH = "ce7aa8a866f43f0733f7e21baa3cc489b47dab4bb84916da691778b3aab21a530dc9680da4501b55f7b01e44aa5c436913f7cd52069b346a82acb404d4ed9bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-moto-server"

RDEPENDS:${PN} += "python310-Flask \
python310-Flask-Cors \
python310-moto-all"

inherit rpm
