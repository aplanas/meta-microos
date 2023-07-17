SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230712"

RPM_NAME = "MicroOS-release-appliance-20230712-1733.1.aarch64.rpm"
RPM_HASH = "689b564d9ff7483b115cc83bed3966bc3817f280a130a1079a45a0b025c39ab6cff8e0b10b307696aa53b11df6e80eaaf91d480a147da7f17c0d317800d7d3f1"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
