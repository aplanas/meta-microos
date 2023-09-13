SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "MicroOS-release-dvd-20230910-1810.1.aarch64.rpm"
RPM_HASH = "4285d4c898dd1c470b283f6a9460d6f03f646c4c3641b4637ca7dab147898cbbe35cbc44b9e6a3f5c052e87d1941657ea29abdfbfdf20470e95bc7b46f4574d1"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
