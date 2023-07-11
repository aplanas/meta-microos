SUMMARY = "Default mounts for SLE distributions"
DESCRIPTION = "Updates /etc/containers/mounts.conf with default mounts for SLE distributions"
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-sles-mounts-20230214-7.1.noarch.rpm"
RPM_HASH = "8218890c15ad88c8b8c6fb3fb07eeaad1a386beb648b64cd9dbf86324b2140a3cd9f9af652178f746f8067e7edbb599e75e4dbc19c8c5a520ab3e605f3ab9cf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-sles-mounts \
libcontainers-sles-mounts"

RDEPENDS:${PN} += ""

inherit rpm
