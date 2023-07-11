SUMMARY = "Prints detailed information about the network devices"
DESCRIPTION = "pcapinfo prints detailed information about the network devices and Pcap library \
available on the current host."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "pcapinfo-0.21-1.4.aarch64.rpm"
RPM_HASH = "f0857da6f14b0625815c79ac540293af2da5373645e7986a2c0fabcd32f159b4227035ee2dd3fba5fac97f50dae08d36556e607b4b70185b5eada54b01db6161"

RPROVIDES:${PN} += "pcapinfo"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-Pcap"

inherit rpm
