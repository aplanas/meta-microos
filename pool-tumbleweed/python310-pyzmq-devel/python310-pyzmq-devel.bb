SUMMARY = "Development files for python310-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python310-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python310-pyzmq-devel-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "247be41dcdadfb3b686bdb0030c3b71f2d71ca4310fbb6064499f2aac96e1a57bce81887b7338fc1189ad2c18c7d568695a81f1f49b6f6714201023d96363fc7"

RPROVIDES:${PN} += "python310-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python310-devel \
python310-pyzmq \
zeromq-devel"

inherit rpm
