SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "MicroOS-release-dvd-20230604-1684.1.aarch64.rpm"
RPM_HASH = "6839ef0a6255fda87e2de62e0d1d93bfe3c72b1d0414f32b253fbc5f9f7bb63d8ed2dd9ac2cac5e6dd627c5cdb0945f2b8dd598a067606817976a2d09243dd33"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
