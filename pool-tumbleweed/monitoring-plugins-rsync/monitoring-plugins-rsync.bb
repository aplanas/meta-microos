SUMMARY = "Check rsync servers availability"
DESCRIPTION = "Checks rsync servers availability, as well as (optionally) individual \
modules availability. It also supports authentication on modules. \
 \
Usage: check_rsync -H  [-p ] [-m [,,] [-m [,,]...]] \
 \
The only required argument is -H, in which case it will only try to \
list modules on the Rsync server."
LICENSE = "GPL-2.0-or-later"

PV = "1.02"

RPM_NAME = "monitoring-plugins-rsync-1.02-4.2.noarch.rpm"
RPM_HASH = "87281a9e4e57ef36d508545052ff2899a2427e367d303cf7112893f4f6dfb23142abf8368108931d580ea2975840cf5c46722f68d8978b7e462f27f64467221e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-rsync \
nagios-plugins-rsync"
RDEPENDS:${PN} += "/usr/bin/perl \
perl(Getopt::Long) \
rsync"

inherit rpm
