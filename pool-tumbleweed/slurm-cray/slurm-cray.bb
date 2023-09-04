SUMMARY = "Cray specific plugins"
DESCRIPTION = "Plugins for specific cray hardware, includes power and knl node management. \
Contains also cray specific documentation."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-cray-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "9e2b9474d84573583c555e37c4dede42f151d8af3d4e15513f5b439e5d93b8ebf29f74e78d214acbbcc18d1a01fad60d323e12116042c5e4cdd8c308b41712bc"

RPROVIDES:${PN} += "slurm-cray"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5"

inherit rpm
