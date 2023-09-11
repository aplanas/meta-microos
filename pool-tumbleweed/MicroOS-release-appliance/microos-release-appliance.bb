SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "MicroOS-release-appliance-20230904-1803.1.aarch64.rpm"
RPM_HASH = "86d80a067e78937a25dbdc5755ab39cdb5109cc58bfc5f5770089a639bbf72530baac4e2929f0772b8e4fd2b898b76b09aee41b56e35890312867c9dfc69c073"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
