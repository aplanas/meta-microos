SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230716"

RPM_NAME = "MicroOS-release-20230716-1738.1.aarch64.rpm"
RPM_HASH = "5521f7b968134a18fe0abc03fc7f2a2afb4c5a37c8968d3a9f3ef14622aa8ad43dca82e54e7cabc9eea75c404a6ddd0326997308ea8f9c016f76538bfafcb34f"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release-20230716 \
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
