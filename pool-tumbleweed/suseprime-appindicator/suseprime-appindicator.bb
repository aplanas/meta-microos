SUMMARY = "SUSE Prime appindicator for switching between GPUs"
DESCRIPTION = "SUSE Prime appindicator for switching between Nvidia/Intel GPUs."
LICENSE = "GPL-2.0-only"

PV = "0.1.0"

RPM_NAME = "suseprime-appindicator-0.1.0-3.7.noarch.rpm"
RPM_HASH = "5d33b60280dee983f6d1288527a32345c5d38de1a4b4ad19d3dec9d57df96d27eb0821acafb51bb3edc51b3e2ad4268bf610db65901f62735654e1a8c0354c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-suseprimeindicator \
python3dist-suseprimeindicator \
suseprime-appindicator"

RDEPENDS:${PN} += "-suse-prime or suse-prime-bbswitch \
/bin/sh \
/usr/bin/python3 \
python-abi \
python3-gobject"

inherit rpm
