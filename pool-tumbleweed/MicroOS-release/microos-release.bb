SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230902"

RPM_NAME = "MicroOS-release-20230902-1800.1.aarch64.rpm"
RPM_HASH = "07001b651554561ddbf51adbd471cbe551c0edc131b053e8a722d8876d61916b88004bcd931326dbff00a52ce7a5bca2da4e145a5d0b1d8760b4b94be7909e21"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230902 \
distribution-release \
openSUSE-MicroOS-release \
openSUSE-Tumbleweed-Kubic-release \
product- \
product-MicroOS \
product-cpeid- \
product-endoflife- \
product-label- \
product-update- \
product-url-releasenotes \
suse-release \
suse-release-oss \
system-installation-"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
glibc \
product-flavor-MicroOS"

inherit rpm
