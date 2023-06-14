SUMMARY = "Hardware related system groups"
DESCRIPTION = "This package provides some hardware related system groups \
required by udev."
LICENSE = "MIT"

PV = "20170617"

RPM_NAME = "system-group-hardware-20170617-24.14.noarch.rpm"
RPM_HASH = "65eecd8abded6982944a0cab6844f633788f59a21f8161c46af8c6f2ee0a400695566c5ad170775ae1734a235100f2ac1ec9160d0ab85d786ae747ae6446e01f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-audio \
group-cdrom \
group-dialout \
group-disk \
group-input \
group-kmem \
group-lock \
group-lp \
group-render \
group-sgx \
group-tape \
group-tty \
group-utmp \
group-video \
system-group-hardware"

RDEPENDS:${PN} += "/bin/sh \
sysuser-shadow"

inherit rpm
