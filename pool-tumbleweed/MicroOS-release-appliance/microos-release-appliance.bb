SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "MicroOS-release-appliance-20230910-1810.1.aarch64.rpm"
RPM_HASH = "5d2df20e0463a6f843a69f142eb85ebc2957f8a7f24f65aafcabcab83b638eab8af98b6770a77a63eff1ac501b069a54ae8d558257a461d5d0908490488bfa23"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
