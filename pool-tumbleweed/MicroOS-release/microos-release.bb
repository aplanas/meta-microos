SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230910"

RPM_NAME = "MicroOS-release-20230910-1810.1.aarch64.rpm"
RPM_HASH = "db8ee11cebe47df07f1a4afdf35fc281d7eda4a7388f0d3075e539d31fd0c3cf3715b5be99c093ef4fe8094e1476cbe722099e5f5a0b0ced72e813118343914a"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230910 \
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
