SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230801"

RPM_NAME = "MicroOS-release-dvd-20230801-1756.1.aarch64.rpm"
RPM_HASH = "d4424ef1203adba00059b3b6f1998e715641a4ec9b45834e7b51224e4c56316cb59e97e007bec52f5fa9053f59f1a164ceabfc87a94c6a4bf7c35e438b705397"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
