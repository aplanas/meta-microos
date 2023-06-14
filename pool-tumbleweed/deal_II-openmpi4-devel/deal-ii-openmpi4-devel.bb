SUMMARY = "Development files for dealii-openmpi4"
DESCRIPTION = "The dealii-openmpi4-devel package contains libraries and header files for \
developing applications that use dealii-openmpi4."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi4-devel-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "8c2a90583bcbe9e83a8ce331368d76df17dbf85c9682c6bc5f32783908b5c8ca1aec6c3db982f66a09e2ee7e085d21bb4fc6f8e284bdcbd8b5a8e02b67720c88"

RPROVIDES:${PN} += "deal-II-openmpi4-devel \
dealii-openmpi4-openmpi4-devel"

RDEPENDS:${PN} += "libdeal-II9-4-2-openmpi4"

inherit rpm
