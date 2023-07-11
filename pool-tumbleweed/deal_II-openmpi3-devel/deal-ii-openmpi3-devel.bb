SUMMARY = "Development files for dealii-openmpi3"
DESCRIPTION = "The dealii-openmpi3-devel package contains libraries and header files for \
developing applications that use dealii-openmpi3."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi3-devel-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "4e7e63c2ea39f42ac6863617a664336eaefe8c10d5ca29ec2c7264caac84a927bf279dfe7910a339aa8d74c3a0085be645a758f5cda41db01d10afe7dc91e564"

RPROVIDES:${PN} += "deal-II-openmpi3-devel \
dealii-openmpi3-openmpi3-devel"

RDEPENDS:${PN} += "libdeal-II9-4-2-openmpi3"

inherit rpm
