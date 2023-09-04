SUMMARY = "Prints detailed information about the network devices"
DESCRIPTION = "pcapinfo prints detailed information about the network devices and Pcap library \
available on the current host."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapinfo-0.21-1.5.aarch64.rpm"
RPM_HASH = "b520e088bd64fa6404362f31bb892ee73051b84abf44e85a83e93784efdbcd3d78848fdfb9660ef257f55cbe82ee903072647c565edec8e9f081fcd70dff78eb"

RPROVIDES:${PN} += "pcapinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
