SUMMARY = "Python implementation of 3-way merge"
DESCRIPTION = "Python implementation of 3-way merge"
LICENSE = "GPL-2.0-or-later"

PV = "0.0.12"

RPM_NAME = "python39-merge3-0.0.12-1.5.noarch.rpm"
RPM_HASH = "ad5f241fbd48d17a7dc3e375c4f96dd0dbbf76637e7fcfe68464e054f37761a95e73598e182c7ff3ccbbad947f8c2dfb1caf0a1755c6cdcf35b82a3c056002a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-merge3 \
python39-merge3 \
python3dist-merge3"

RDEPENDS:${PN} += "python-abi"

inherit rpm
