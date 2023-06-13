SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python39-importlab-0.8-1.4.noarch.rpm"
RPM_HASH = "430a7321a3b39e201c868ae3d60d9baea584bb17ff97b31f6b5e1fcd5e9c8a97a8c4008ec459804cfce4d0ce65874a4350447e26c6a748068cc97d50f420c17f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(importlab) \
python39-importlab \
python3dist(importlab)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-networkx \
update-alternatives"

inherit rpm
