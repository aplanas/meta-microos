SUMMARY = "Check SMB Disk"
DESCRIPTION = "Check the amount of used disk space on a remote Samba or Windows share and \
generate an alert if free space is less than one of the threshold values."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-disk_smb-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "c04e0fcb6da93c8625b6e7dad92a5afea2c6a7d0058a869c16b58aaaf425852956b637f9ca283d062f80cfa393bcc42d597845c1b741e4ca59652152aad0d160"

RPROVIDES:${PN} += "monitoring-plugins-disk_smb \
monitoring-plugins-disk_smb(aarch-64) \
nagios-plugins-disk_smb"
RDEPENDS:${PN} += "/usr/bin/perl \
monitoring-plugins-common \
perl"

inherit rpm
