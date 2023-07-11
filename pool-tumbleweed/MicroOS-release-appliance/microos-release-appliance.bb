SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "MicroOS-release-appliance-20230707-1726.1.aarch64.rpm"
RPM_HASH = "a5ba0283d8e31f5042d5800407d9e46dc2c1fb935279a435f7bb4ac79fda50d77d71d01ce45fce77a73e61c8b37d90909a4423872470a006754ed40c6975eb84"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
