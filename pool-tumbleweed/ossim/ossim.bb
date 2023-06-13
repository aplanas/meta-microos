SUMMARY = "Open Source Software Image Map (OSSIM)"
DESCRIPTION = "The OSSIM core utilities. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-2.11.1-1.20.aarch64.rpm"
RPM_HASH = "72d14402f70d663bf3c13cdec22f3319a5968b3f06d8dce3ea3017bfeb1acc512c9dd403bdea4dd00486293882bbace6ff6c93eb4b7c61e31028e4f958d7eb95"

RPROVIDES:${PN} += "ossim \
ossim(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libossim.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
