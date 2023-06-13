SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python310-moto-server-4.1.0-1.5.noarch.rpm"
RPM_HASH = "0b6e61f6f0c0a18a2a65600b04b8a383e7d687e3a7f7d7cff5e13a3df5e8032d10cc87104b84f3d22f139502ab207747878a2028c88bcd71017143e2fe2dd47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-server \
python310-moto-server"

RDEPENDS:${PN} += "python310-Flask \
python310-Flask-Cors \
python310-moto-all"

inherit rpm
