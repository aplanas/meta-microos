SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "MicroOS-release-dvd-20230902-1800.1.aarch64.rpm"
RPM_HASH = "c5f13acca8c17cea83f271821988d2021fa7ebfadf8f7a9e502981310d09773fee325cadc5fb24a59c5c0083e8abead7988e8c759dcbfc5484ce47be5e302cf6"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
