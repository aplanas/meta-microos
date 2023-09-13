SUMMARY = "Config files and directories for slurm services"
DESCRIPTION = "This package contains the slurm config files necessary direcories \
for the slurm daemons."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-config-23.02.4-2.1.noarch.rpm"
RPM_HASH = "37efb96261d20758f93cb9caa3f3349f3fa6b4b36fde297035702f013e9d76133e7b525eaababd0d26ca2f88248e7be93f71977d753a36d2a28f6f0d337d95a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-slurm-config \
group-slurm \
slurm-config \
user-slurm"

RDEPENDS:${PN} += "/usr/bin/sh \
logrotate \
shadow"

inherit rpm
