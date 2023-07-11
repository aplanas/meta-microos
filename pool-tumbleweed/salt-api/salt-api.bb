SUMMARY = "The api for Salt a parallel remote execution system"
DESCRIPTION = "salt-api is a modular interface on top of Salt that can provide a variety of entry points into a running Salt system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-api-3006.0-1.4.aarch64.rpm"
RPM_HASH = "912cc299eeafc20e1c45e2574f8757025bdb1b5c281d0f1f1f455e1654a9fa3df76dd6aadf9f44c33fd85e6840ab570f55c0f79f27869c6ad0af6dd893680930"

RPROVIDES:${PN} += "salt-api"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-CherryPy \
salt \
salt-master"

inherit rpm
