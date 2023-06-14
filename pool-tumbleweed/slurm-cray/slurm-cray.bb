SUMMARY = "Cray specific plugins"
DESCRIPTION = "Plugins for specific cray hardware, includes power and knl node management. \
Contains also cray specific documentation."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-cray-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "01ef5fec5f3cf5222a9363d30ee701add95603846f9575baa5450b840a71b73a8e463864b2cf85909d57a415cea178a1b075c7cb85ce886f574f12fc0dee97c1"

RPROVIDES:${PN} += "slurm-cray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
