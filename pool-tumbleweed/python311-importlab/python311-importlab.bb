SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python311-importlab-0.8-1.4.noarch.rpm"
RPM_HASH = "0a18cce1b227f3226f43cd49cbab5830eca6ff1ef46baf7127dd12cc1748bbaaae65443fa30b43039aee3d29a233d742cfd7f3e7520ffa6665241a7e721d2fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(importlab) \
python311-importlab \
python3dist(importlab)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-networkx \
update-alternatives"

inherit rpm
