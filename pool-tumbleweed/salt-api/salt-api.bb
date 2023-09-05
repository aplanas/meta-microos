SUMMARY = "The api for Salt a parallel remote execution system"
DESCRIPTION = "salt-api is a modular interface on top of Salt that can provide a variety of entry points into a running Salt system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-api-3006.0-4.1.aarch64.rpm"
RPM_HASH = "6b92aa1108fd0ef0046891e70ac2e673234842e44b103398611093e4d04dbbb787816c2f14449a627ba085118b47d3da463b5c190a8db4f897bf09459640b0d5"

RPROVIDES:${PN} += "salt-api"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-CherryPy \
salt \
salt-master"

inherit rpm
