SUMMARY = "openSUSE MicroOS"
DESCRIPTION = "openSUSE MicroOS combines the benefits of a rolling OS with a read-only root filesystem with transactional updates. It is a modern Linux Operating System, designed for single-service installations, such as container hosts. It is optimized for large, clustered deployments. \
        It inherits the benefits of openSUSE Tumbleweed while redefining the operating system into a small, efficient and reliable distribution."
LICENSE = "GPL-2.0-or-later"

PV = "20230604"

RPM_NAME = "MicroOS-release-20230604-1684.1.aarch64.rpm"
RPM_HASH = "902cd290008c1354a81f428c1b7ed127ff63b826500771cdd279872c0ec264842e8b50de0c817f0da27f3d47e5a1c855a4b0726b1e81d59ad4cb13812abe8574"

RPROVIDES:${PN} += "MicroOS-release \
MicroOS-release(aarch-64) \
MicroOS-release-20230604 \
distribution-release \
openSUSE-MicroOS-release \
openSUSE-Tumbleweed-Kubic-release \
product() \
product(MicroOS) \
product-cpeid() \
product-endoflife() \
product-label() \
product-update() \
product-url(releasenotes) \
suse-release \
suse-release-oss \
system-installation()"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
glibc \
product_flavor(MicroOS)"

inherit rpm
