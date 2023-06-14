SUMMARY = "Prints detailed information about the network devices"
DESCRIPTION = "pcapinfo prints detailed information about the network devices and Pcap library \
available on the current host."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapinfo-0.21-1.3.aarch64.rpm"
RPM_HASH = "b0e460a8566ee10ba23eaba608fff4c5519c81f3cfdd70300594babb827aa506fc36fdbb7732ff502cf9378fedee50a7ea115e2c37fad39d9c172db3a403854e"

RPROVIDES:${PN} += "pcapinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
