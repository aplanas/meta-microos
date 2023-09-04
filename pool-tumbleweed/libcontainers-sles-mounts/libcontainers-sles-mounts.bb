SUMMARY = "Default mounts for SLE distributions"
DESCRIPTION = "Updates /etc/containers/mounts.conf with default mounts for SLE distributions"
LICENSE = "Apache-2.0"

PV = "20230814"

RPM_NAME = "libcontainers-sles-mounts-20230814-1.1.noarch.rpm"
RPM_HASH = "0197c669d5754ccd30a00ab83adebde338dc1936cb0fd18a01a5f231caa9b351c473c55ecb5233d13d282a5dd4656ca9a15769c6d58d961a64aec204e3f19165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libcontainers-sles-mounts \
libcontainers-sles-mounts"

RDEPENDS:${PN} += ""

inherit rpm
