SUMMARY = "Header files for the Open Source Software Image Map"
DESCRIPTION = "The OSSIM development files. \
Open Source Software Image Map (OSSIM) is an engine for \
remote sensing, image processing, geographical information systems and \
photogrammetry."
LICENSE = "LGPL-3.0-only"

PV = "2.11.1"

RPM_NAME = "ossim-devel-2.11.1-1.20.aarch64.rpm"
RPM_HASH = "23e009f2fe6afe4aa02f7ebd6d7251fd55c4f431ce20285f1b626bfe259cc7e19b71e258cb4f28ea7e1e197102680cc2293b8dd0b3a2c91717fa33db2c2c0e6b"

RPROVIDES:${PN} += "libossim-devel \
ossim-devel \
ossim-devel(aarch-64)"

RDEPENDS:${PN} += "libossim1"

inherit rpm
