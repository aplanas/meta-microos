SUMMARY = "Check SMB Disk"
DESCRIPTION = "Check the amount of used disk space on a remote Samba or Windows share and \
generate an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-disk_smb-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "02151dbfd03f397021bb101f72453b1e7e67a45bc4170259f2dbbf5750fba77fc7bb2f017aaee7d624b6b10e97447f96d295a605daebca42161960d05193d474"

RPROVIDES:${PN} += "monitoring-plugins-disk-smb \
nagios-plugins-disk-smb"

RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm
