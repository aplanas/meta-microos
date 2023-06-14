SUMMARY = "Development files for kismet"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains files files for developing applications that \
want to make use of kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-devel-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "f2f8d79d9e2fb5bcc835e05b1d77774a846f3f7146dcaca6add13d1c18e50aecb5fddeddcf73a39793f5de5734a7350289d2430080cf7e620d13f7f0423fb513"

RPROVIDES:${PN} += "kismet-devel \
pkgconfig-kismet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kismet"

inherit rpm
