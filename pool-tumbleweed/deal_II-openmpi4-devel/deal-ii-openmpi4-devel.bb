SUMMARY = "Development files for dealii-openmpi4"
DESCRIPTION = "The dealii-openmpi4-devel package contains libraries and header files for \
developing applications that use dealii-openmpi4."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi4-devel-9.4.2-1.5.aarch64.rpm"
RPM_HASH = "49790af05123fdbded6ebeed07cd7df706c5af6f65841007a59f715c1e4b1b26ed5d17f171f9c0962681b999cfd618a9b1454ded58f570b8e6de68146313200c"

RPROVIDES:${PN} += "deal-II-openmpi4-devel \
dealii-openmpi4-openmpi4-devel"

RDEPENDS:${PN} += "libdeal-II9-4-2-openmpi4"

inherit rpm
