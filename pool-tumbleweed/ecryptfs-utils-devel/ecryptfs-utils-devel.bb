SUMMARY = "Development files for ecryptfs-utils"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-devel-111-7.4.aarch64.rpm"
RPM_HASH = "baed0684fd8a32a13aa329bdfe3d8c8a52846fd15fabec542cf72f2dca8e8a6f7bb50d0a9fc658b61e94ccfc5a35711ede7b4cabd68a45cab53b4b35dbef15b7"

RPROVIDES:${PN} += "ecryptfs-utils-devel \
ecryptfs-utils-devel(aarch-64) \
pkgconfig(libecryptfs)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libecryptfs1"

inherit rpm
