SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230719"

RPM_NAME = "MicroOS-release-dvd-20230719-1742.1.aarch64.rpm"
RPM_HASH = "26d1979ecbe2c7859be1b0f0dc894e64926d5eed0ad4862a9345de6c05770bb48aacebcf20fc89a433f4071cfcefc2f6892f009dd2ca97e7bd905edf873aa4ad"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
