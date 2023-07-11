SUMMARY = "Development files for python39-pyzmq"
DESCRIPTION = "Development libraries and headers needed to build software using python39-pyzmq."
LICENSE = "BSD-3-Clause & LGPL-3.0-or-later"

PV = "25.0.2"

RPM_NAME = "python39-pyzmq-devel-25.0.2-1.3.aarch64.rpm"
RPM_HASH = "2753fa1f25cfbd988333394d96a3258074f6bc1f39e2da6bcfdd7d48eabdf3cf5b159a2fd8cc73caa18929e426b0489842a1359a0eb731e66a16e7d8ecccf4f3"

RPROVIDES:${PN} += "python39-pyzmq-devel"

RDEPENDS:${PN} += "python-abi \
python39-devel \
python39-pyzmq \
zeromq-devel"

inherit rpm
