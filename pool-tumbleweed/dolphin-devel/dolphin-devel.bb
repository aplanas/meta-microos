SUMMARY = "KDE File Manager"
DESCRIPTION = "This package contains the libraries used by Dolphin and Konqueror."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "dolphin-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "15d1592ce223dcdd350278aca5ff1ec2233a4007328c01d4605194e0a808be02bc4678ca02ea21a6a67c39fa388197b2935e5e6e7237194a5ceb3aaa760d9c4a"

RPROVIDES:${PN} += "cmake-DolphinVcs \
dolphin-devel \
dolphin5-devel"

RDEPENDS:${PN} += "libdolphinvcs5"

inherit rpm
