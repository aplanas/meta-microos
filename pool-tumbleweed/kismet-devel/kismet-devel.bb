SUMMARY = "Development files for kismet"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains files files for developing applications that \
want to make use of kismet."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-devel-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "7841bef874cc566b5939360845107d88da823c38680286a798b24d77457ae238411236747f5f30de0bbdddb5118129f8f268ef229520d76c0032cadcdbcd3949"

RPROVIDES:${PN} += "kismet-devel \
pkgconfig-kismet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
kismet"

inherit rpm
