SUMMARY = "Check anti-spam blocklists for given server"
DESCRIPTION = "This monitoring plugin will check whether the specified server is in any of the \
numerous anti-spam blocklists."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "monitoring-plugins-bl-1.0-101.15.noarch.rpm"
RPM_HASH = "722f11c8fd80d5f7c3e9b39c99adb627321ef385c0234132562a67e8c3007c16f75e58efe5c26331229f123dec73c10dc83bb0f0c7663ae3fe08e429590bacd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-bl \
nagios-plugins-bl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net--DNS"

inherit rpm
