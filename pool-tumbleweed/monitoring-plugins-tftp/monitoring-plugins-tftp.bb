SUMMARY = "Check a remote tftp server"
DESCRIPTION = "This plugin checks for availability of a TFTP Server, \
which is normaly used for booting clients over the network. \
 \
It downloads a test file from the TFTP server and checks its size against a \
given value."
LICENSE = "GPL-2.0+"

PV = "0.11"

RPM_NAME = "monitoring-plugins-tftp-0.11-100.16.noarch.rpm"
RPM_HASH = "660b2dcef9dddfb5c15fdfbf99cf7c837541c042f48013317e25a55cb1bf27dca92149d90182918c07b72c578a99c87f5449413a976fe6f441bded07cd6290b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "monitoring-plugins-tftp \
nagios-plugins-tftp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-FileHandle \
perl-Net--TFTP"

inherit rpm
