SUMMARY = "Default mounts for SLE distributions"
DESCRIPTION = "Updates /etc/containers/mounts.conf with default mounts for SLE distributions"
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-sles-mounts-20230214-5.1.noarch.rpm"
RPM_HASH = "0da0e976973be95c4061c2885186436b2d18c0525c7a85572fe59562ba91d2c72f87b6f2f0278bb2b06207fa6980398231e1b791572b5a6c3f5be30e9fd3ca7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libcontainers-sles-mounts) \
libcontainers-sles-mounts"

RDEPENDS:${PN} += ""

inherit rpm
