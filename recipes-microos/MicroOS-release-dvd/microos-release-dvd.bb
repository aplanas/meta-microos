SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "MicroOS-release-dvd-20230509-1651.1.aarch64.rpm"
RPM_HASH = "90d73929fee6a1a5db21942f05f4f147808ec770d438abef13a7fdde5eeae9dcbf849f6b2e024c086bf05d1e956f83987a8fca1bb9617ff0981b8341579333d7"

RPROVIDES:${PN} += "MicroOS-release-dvd MicroOS-release-dvd(aarch-64) flavor(dvd) product_flavor() product_flavor(MicroOS)"
RDEPENDS:${PN} += ""

inherit rpm
