SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "MicroOS-release-dvd-20230712-1733.1.aarch64.rpm"
RPM_HASH = "0f82f5545caa95ed4ca18bfd45bd2a4633c894eaa4355bb4294b67954addcbfc81abf54670045b2f9165d3d7fa4e14bd9817b5c302728ca05540d73c6c6fecc3"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
