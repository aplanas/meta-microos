SUMMARY = "Development files for the VBI decoding library"
DESCRIPTION = "This package includes the development files for the zvbi library which \
provides routines to read from raw VBI sampling devices, to demodulate raw to \
sliced VBI data, and to interpret the data of several popular services."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.2.42"

RPM_NAME = "zvbi-devel-0.2.42-1.1.aarch64.rpm"
RPM_HASH = "d5024d5eff8fd05c927f1d1e3d7426eac543991bef912009cbef14269e6d8f988a884554e23ec694d68bb4457575b156077ffd130f8d34f5724dcac21c9c5564"

RPROVIDES:${PN} += "pkgconfig-zvbi-0.2 \
zvbi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzvbi-chains0 \
libzvbi0"

inherit rpm
