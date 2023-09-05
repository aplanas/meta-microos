SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230902"

RPM_NAME = "MicroOS-release-appliance-20230902-1800.1.aarch64.rpm"
RPM_HASH = "984d5a5b40232a058233d856cd9dface49b7d188528d0cd9d391114040d1b9b6b64d33390bac26acf86b50f67878db0bff8ff0415d2e5473823a72937af827fe"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
