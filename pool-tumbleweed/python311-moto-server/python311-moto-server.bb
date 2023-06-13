SUMMARY = "Library to mock out the boto library -- all extras"
DESCRIPTION = "A library that allows your python tests to mock out the boto \
library. Meta package to install server extras (moto[server])"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python311-moto-server-4.1.0-1.5.noarch.rpm"
RPM_HASH = "f86fac13cec1aae5ba1527e6d7917651389ad9920b6bc024ed18fbef883fbeba2e5af93103ed3a87bfd180a3849073ad8639476fea2208b853f34d9a87259ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-moto-server"

RDEPENDS:${PN} += "python311-Flask \
python311-Flask-Cors \
python311-moto-all"

inherit rpm
