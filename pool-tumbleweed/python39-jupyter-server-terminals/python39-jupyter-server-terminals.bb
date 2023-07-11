SUMMARY = "A Jupyter Server Extension Providing Terminals"
DESCRIPTION = "A Jupyter Server Extension Providing Terminals."
LICENSE = "BSD-3-Clause"

PV = "0.4.4"

RPM_NAME = "python39-jupyter-server-terminals-0.4.4-1.5.noarch.rpm"
RPM_HASH = "50bc6d1abe4afbb638e48aa03db5474fd4e9465c5a4dea1d716f7453f285a32a91793191da685a6d5abecbf93cd3782bec6f2b119c51a8c9ac7c99be9a62feea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-server-terminals \
python39-jupyter-server-terminals \
python3dist-jupyter-server-terminals"

RDEPENDS:${PN} += "jupyter-server-terminals \
python-abi \
python39-terminado"

inherit rpm
