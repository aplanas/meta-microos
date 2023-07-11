SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-server-4.1.0-1.7.noarch.rpm"
RPM_HASH = "c0bea0331daf841140ffa771cbbd1ca463de281bf835a7f0908b452f1812628369f6e0d9df35a2b67452a75d95ef50cdeaf72881f6c30976257f332567a06397"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-moto-server \
python311-moto-server"

RDEPENDS:${PN} += "python311-Flask \
python311-Flask-Cors \
python311-moto-all"

inherit rpm
