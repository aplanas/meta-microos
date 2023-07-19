SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "MicroOS-release-dvd-20230716-1738.1.aarch64.rpm"
RPM_HASH = "45209fa8c133aee82f120c5b33e9b3302369981fed5597aaf2ddc14a3eb7e3206f5ee769a888ecc9c31db357d9400ae458f3bbaa72c89ceb49b5f0f39cd8a501"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
