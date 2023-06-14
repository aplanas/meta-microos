SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "MicroOS-release-appliance-20230604-1684.1.aarch64.rpm"
RPM_HASH = "61ce485692a5ef68b8a6e2d6ae6f3eefa0a1d6720c551cb15e6154aec67efb1d7d403695ea4e52e7c1179984775d5c01cb1ab1e3795c6a65d4434fb6bc730a42"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
