SUMMARY = "RELAX NG Compact to regular syntax conversion library"
DESCRIPTION = "RELAX NG Compact to regular syntax conversion library"
LICENSE = "MIT"

PV = "2.6.6"

RPM_NAME = "python310-rnc2rng-2.6.6-1.11.noarch.rpm"
RPM_HASH = "afd3e699637e73c912491130b26321242ee30e795b9a448534c1f889abf4ee1cf55697f195cef87b07afb10fced68865d4be7a4b4648e819dfd2ce5611f2968f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rnc2rng \
python3.10dist-rnc2rng \
python310-rnc2rng \
python3dist-rnc2rng"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-rply \
update-alternatives"

inherit rpm
