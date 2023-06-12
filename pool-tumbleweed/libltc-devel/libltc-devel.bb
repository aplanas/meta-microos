SUMMARY = "Linear/longitudinal timecode library"
DESCRIPTION = "Linear (or Longitudinal) Timecode (LTC) is an encoding of SMPTE timecode \
data as a Manchester-Biphase encoded audio signal. The audio signal is \
commonly recorded on a VTR track or other storage media. \
 \
libltc provides functionality to encode and decode LTC audio from/to SMPTE \
or EBU timecode, including SMPTE date support."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3.2"

RPM_NAME = "libltc-devel-1.3.2-1.3.aarch64.rpm"
RPM_HASH = "1f9a7f957efde2d9fbf7eebf86e1145bc2f4067da4c10f5d3af22ddb9fa2b6d7b73d9565831732635c398737de4a408af70633d74f1d5be931a02bb98c5b88be"

RPROVIDES:${PN} += "libltc-devel \
libltc-devel(aarch-64) \
pkgconfig(ltc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libltc11"

inherit rpm
