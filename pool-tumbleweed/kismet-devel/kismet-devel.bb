SUMMARY = "Development files for kismet"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains files files for developing applications that \
want to make use of kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-devel-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "255250cc37b78cd8e803812b4644bef448321efc515589ea59e97fbf02e3a8a55ec28f1bfe965f4e8783a5cf674ad7b93dfd71c52c664319e2786f3aa726feb9"

RPROVIDES:${PN} += "kismet-devel \
pkgconfig-kismet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kismet"

inherit rpm
