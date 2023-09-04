SUMMARY = "The api for Salt a parallel remote execution system"
DESCRIPTION = "salt-api is a modular interface on top of Salt that can provide a variety of entry points into a running Salt system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-api-3006.0-2.1.aarch64.rpm"
RPM_HASH = "0b8db11ccfa55050fec4a0d83cb678d456171ff9807a2ffe29d6b33703e84f1876054d9b86e16cc2e4cdea0b95426110e221bb78c1b626479e9471f80108a7f3"

RPROVIDES:${PN} += "salt-api"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-CherryPy \
salt \
salt-master"

inherit rpm
