SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230707"

RPM_NAME = "MicroOS-release-dvd-20230707-1726.1.aarch64.rpm"
RPM_HASH = "eebc1b801a8dd47d43625b0d09462c093f5f9827b58e241fec8b62544c354c397f1fdfe927ab2c5c709c5b3f77443686d3de06592bbd09f6ea03c2293954f243"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
