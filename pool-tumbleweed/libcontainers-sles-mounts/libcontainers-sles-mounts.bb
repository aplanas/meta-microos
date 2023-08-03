SUMMARY = "Default mounts for SLE distributions"
DESCRIPTION = "Updates /etc/containers/mounts.conf with default mounts for SLE distributions"
LICENSE = "Apache-2.0"

PV = "20230214"

RPM_NAME = "libcontainers-sles-mounts-20230214-8.1.noarch.rpm"
RPM_HASH = "74faccac6726d0ac8a777cf529b7d0e06aa2dffe3f7f4085f9558efb1168bbe54265f5677cba6eff1a13d9296be26137ccf5d5e3519940d3e2b7506d6cba862b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-sles-mounts \
libcontainers-sles-mounts"

RDEPENDS:${PN} += ""

inherit rpm
