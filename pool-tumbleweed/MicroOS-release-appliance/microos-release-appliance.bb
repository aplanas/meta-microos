SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "MicroOS-release-appliance-20230801-1756.1.aarch64.rpm"
RPM_HASH = "ad91094753a8d7a72a6a85f1d103c449461c796fb11ed7550b059f81a8a0b620267278be0b09cd2957c389ab74693563414c4b4ee1b0648f5d75b61293beb93c"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
