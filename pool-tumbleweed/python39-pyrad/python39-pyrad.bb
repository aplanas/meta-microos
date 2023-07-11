SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python39-pyrad-2.4-3.10.noarch.rpm"
RPM_HASH = "f92465f64a7cb8ede80a1962a77a4f7e2999c6bfc07f3675381e414915d993d5b9ec232c752fda07e649e70e310d53204d8fd8ceb6e346ad1c129a7158c15e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyrad \
python39-pyrad \
python3dist-pyrad"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
