SUMMARY = "Common data files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains common data that is used by the cheese libraries, \
like schemas."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libcheese-common-44.1-1.1.noarch.rpm"
RPM_HASH = "d3b2e92992befbd1d1bfd3fa11b5a8e1ac7153c99d9571eab72d454a750a94a74b956a2682cafbc5bfb9dac707b07235ea2972eaf0d38c2d4a77fca86a8790b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcheese-common"

RDEPENDS:${PN} += ""

inherit rpm
