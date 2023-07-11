SUMMARY = "SUSE Prime appindicator for switching between GPUs"
DESCRIPTION = "SUSE Prime appindicator for switching between Nvidia/Intel GPUs."
LICENSE = "GPL-2.0-only"

PV = "0.1.0"

RPM_NAME = "suseprime-appindicator-0.1.0-3.8.noarch.rpm"
RPM_HASH = "b7595388a0a66d1ba6bbd62b8e201f9a2a53297e9b9c3520b957124e06fb0c6049f6a0860fd43d98897b8844215222435dcdff8909abbdef970e089278a6209a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-suseprimeindicator \
python3dist-suseprimeindicator \
suseprime-appindicator"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
python3-gobject"

inherit rpm
