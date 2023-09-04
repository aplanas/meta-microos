SUMMARY = "Development files for dealii-openmpi3"
DESCRIPTION = "The dealii-openmpi3-devel package contains libraries and header files for \
developing applications that use dealii-openmpi3."
LICENSE = "LGPL-2.1-or-later"

PV = "9.5.1"

RPM_NAME = "deal_II-openmpi3-devel-9.5.1-1.1.aarch64.rpm"
RPM_HASH = "93ba18f57cb26f1481af94d57498b7aff25f270bbb34a5a96dce132804820b2039a235f0de17d97e51e3a972b68501884b0ac08a4d2298b4ce7b0e8d2a14bbb2"

RPROVIDES:${PN} += "deal-II-openmpi3-devel \
dealii-openmpi3-openmpi3-devel"

RDEPENDS:${PN} += "libdeal-II9-5-1-openmpi3"

inherit rpm
