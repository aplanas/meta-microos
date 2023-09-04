SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "This package contains the slurm config files necessary direcories \
for the slurm daemons."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-23.02.2-1.4.noarch.rpm"
RPM_HASH = "d8ccca2a7f6360a9ede2c28491e3bcfe6c59cddb2bfb2a5772a18ad1d3ee8e95e02d62998f0dd7063e52fb34cb5cdbb3a34cff1cd5bba0efcbc731cf3bef1c25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-config \
group-slurm \
slurm-config \
user-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
logrotate \
shadow"

inherit rpm
