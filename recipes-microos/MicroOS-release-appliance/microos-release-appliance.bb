SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "MicroOS-release-appliance-20230509-1651.1.aarch64.rpm"
RPM_HASH = "3e9d5f6dd66fd80173b1f5e1686d985ec94c6baf828a8e20e046ce2626d79bdd4a9b69130ac2c0cf3fe38230900f4d2c0bb42d1d7860419c0a9e8db219645c4b"

RPROVIDES:${PN} += "MicroOS-release-appliance MicroOS-release-appliance(aarch-64) flavor(appliance) product_flavor() product_flavor(MicroOS)"
RDEPENDS:${PN} += ""

inherit rpm
