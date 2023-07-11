SUMMARY = "Header files for the Open Source Software Image Map"
DESCRIPTION = "The OSSIM development files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-devel-2.11.1-1.21.aarch64.rpm"
RPM_HASH = "19c3c1b970978dfd24336ae289ffc8ccfddfc7fed0afcdd5b984faed0aa9942f5db8ac14d47b39727aa8fc07b10408b7ce57224f6f116b9a009e4a937e753437"

RPROVIDES:${PN} += "libossim-devel \
ossim-devel"

RDEPENDS:${PN} += "libossim1"

inherit rpm
