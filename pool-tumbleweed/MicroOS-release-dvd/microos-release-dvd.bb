SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "BSD-3-Clause"

PV = "20230904"

RPM_NAME = "MicroOS-release-dvd-20230904-1803.1.aarch64.rpm"
RPM_HASH = "0fda7ef963cc17a73c292ffe2b7107f9467e4bbc23dd929cf5bd242b391c6dc5189fbaa962a07aab3f5f0b27826b540271a087a849be51a752bffb18268e38ee"

RPROVIDES:${PN} += "MicroOS-release-dvd \
flavor-dvd \
product-flavor- \
product-flavor-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
