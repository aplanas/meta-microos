SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230716"

RPM_NAME = "MicroOS-release-appliance-20230716-1738.1.aarch64.rpm"
RPM_HASH = "f023425bcb0a205ee40c66e68e403c6dcbe5084355396428e5a43fd4ece62511037881aa326280990b0527218fad2ae560fcc4d6c19ffe6e9c387516ddee6270"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
