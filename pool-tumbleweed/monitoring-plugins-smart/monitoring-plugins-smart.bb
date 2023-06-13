SUMMARY = "Check SMART status of a given disk"
DESCRIPTION = "This plugin does SMART monitoring both ATA and SCSI disks, has an easy usage \
syntax, and automatically produces perfdata for all applicable metrics. \
 \
Note: \
On older distributions you need a line like \
 nagios        ALL=(root) NOPASSWD: /usr/lib/nagios/plugins/check_smart \
in /etc/sudoers to run this script as non privileged user. \
 \
Since SLES 12/openSUSE 12.1, there is a file \
  /etc/sysconfig/sudoers.d/monitoring-plugins-smart \
which holds the same content and should be used automatically."
LICENSE = "GPL-3.0-or-later"

PV = "6.14.0"

RPM_NAME = "monitoring-plugins-smart-6.14.0-1.1.noarch.rpm"
RPM_HASH = "9830abf600bb17a28453932f6af41c44ae21e2fbaf505862a9c047e8dd2860bd57f651a88a4e509e60d942a39fa01814d7fbfd90e49c24e2dca097e39754b36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(monitoring-plugins-smart) \
monitoring-plugins-smart \
nagios-plugins-smart"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl(File::Basename) \
perl(FindBin) \
perl(Getopt::Long) \
smartmontools \
sudo"

inherit rpm
