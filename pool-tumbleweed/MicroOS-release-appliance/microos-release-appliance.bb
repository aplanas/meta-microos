SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "MicroOS-release-appliance-20230802-1758.1.aarch64.rpm"
RPM_HASH = "b6b407076a3f7516d625b2cf53eaba4e8cc75c0a795b9344228879af987b3b23a444e83ba1a65f954453c5de973d432070ee322f4f12423617f8c117cc01d8e4"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
