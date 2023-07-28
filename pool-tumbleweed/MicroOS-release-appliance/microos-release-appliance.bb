SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "MicroOS-release-appliance-20230719-1742.1.aarch64.rpm"
RPM_HASH = "9a12a5b6193fa1c1cbe196204cafaee7aa61d5615ad0bbb98036e1f08b059ba4015569b1cdf91c5d17d40bf2ee435203f8196843ecabf7a5a7206078e9266010"

RPROVIDES:${PN} += "MicroOS-release-appliance \
flavor-appliance \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
