SUMMARY = "Development files for python311-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python311-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python311-pyzmq-devel-25.0.2-1.1.aarch64.rpm"
RPM_HASH = "16b63f6f86f9f7d61f082e3a6ebf5efcd53efc760d37f7c61c0fc804038a0b19403691931914c7ad3f6930bec4036dff43aa3c07fdedb882cb79f36765662a90"

RPROVIDES:${PN} += "python311-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python311-devel \
python311-pyzmq \
zeromq-devel"

inherit rpm
