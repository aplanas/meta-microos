SUMMARY = "Development files for Osmocom HNBAP library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-hnbap."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-hnbap-devel-1.4.0-1.1.aarch64.rpm"
RPM_HASH = "9024e72e50477afcd3f9356350bb1f3b46c1ff50b6aba94cee357c4ef8499e74014401e6274188c5a91e6dc3459d9c5eb9519ec73b3a1a43dbacd927a4bd1d56"

RPROVIDES:${PN} += "libosmo-hnbap-devel \
libosmo-hnbap-devel(aarch-64) \
pkgconfig(libosmo-hnbap)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-hnbap0"

inherit rpm
