SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "MicroOS-release-dvd-20230802-1758.1.aarch64.rpm"
RPM_HASH = "b0cd80b868a8732ee644baef69cd3fc0d75b1a9769e6fb6e7dad20c947049e2e46a36711ef2e09a10321b927dfd6e6e5651c4bd18500ffad7f3f04331076c651"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
