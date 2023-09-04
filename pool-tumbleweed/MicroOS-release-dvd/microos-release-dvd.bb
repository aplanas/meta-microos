SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230828"

RPM_NAME = "MicroOS-release-dvd-20230828-1789.1.aarch64.rpm"
RPM_HASH = "1ee560b46e18335249e34b0306e41daa43fb25f3cf94978a0dc9154a34298e99b603be5a65f5bafe2804e3e08f7d4332055276e9068e099872ae230feeb4d170"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
