SUMMARY = "Development files for libfreesrp"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libfreesrp."
LICENSE = "GPL-3.0"

PV = "0.3.0"

RPM_NAME = "freesrp-devel-0.3.0-1.28.aarch64.rpm"
RPM_HASH = "34bc0ba389b47f078d94a50ccedeae9ab05d851dc2d5adf6b3e432301704f4a7bb650c212de3dce7f712550ddd75bb0307d8ea16e8d1126d8bc3f15d16f813e0"

RPROVIDES:${PN} += "freesrp-devel"

RDEPENDS:${PN} += "libfreesrp0"

inherit rpm
