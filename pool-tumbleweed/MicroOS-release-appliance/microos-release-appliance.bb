SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "MicroOS-release-appliance-20230828-1789.1.aarch64.rpm"
RPM_HASH = "332e44da43daa469a883e67658b523b78d389e5423ec26bba5f2c94579d9ab0be3f71180e7dcff928d8e527943294160435bcd9fe3a2ea61828ee70dbf6e8ce5"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
