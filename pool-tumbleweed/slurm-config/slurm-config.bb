SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "This package contains the slurm config files necessary direcories \
for the slurm daemons."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-config-23.02.2-1.3.noarch.rpm"
RPM_HASH = "93ff3de8b06e324c796dd43c0e4c7a789ef5151ed8fc80c0d0d807819d0da26c0088cee09e2b02d4a00c25f43fd5daa0e567c7d4bf49930666308adfffb49164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-config \
group-slurm \
slurm-config \
user-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
logrotate \
shadow"

inherit rpm
