SUMMARY = "FacetimeHD firmware download and extraction tool"
DESCRIPTION = "FacetimeHD firmware download and extraction tool"
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "facetimehd-firmware-1.0-1.6.noarch.rpm"
RPM_HASH = "cdbdcdf8241be402e4118d65b0db273848bb84011d8ede47839bd7bb724ec1eb624d285a58bf472b4f8d20bb7f2a38d05e7834436b2bc2b8b3c89a41cf67ab23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "facetimehd-firmware"

RDEPENDS:${PN} += "/bin/bash \
coreutils \
cpio \
curl \
unzip \
xz"

inherit rpm
