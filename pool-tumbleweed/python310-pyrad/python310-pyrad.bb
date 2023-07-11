SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.4"

RPM_NAME = "python310-pyrad-2.4-3.10.noarch.rpm"
RPM_HASH = "bf876568e1a979fa2f8885e1363ea4065d661c1c82b217a30b457a02217e07667252f1a84204b29ef3053f5c54a9372f72f54e6c79a0b8bd753e732318ebb92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyrad \
python310-pyrad \
python3dist-pyrad"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
