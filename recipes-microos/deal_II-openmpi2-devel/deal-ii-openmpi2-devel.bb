SUMMARY = "Development files for dealii-openmpi2"
DESCRIPTION = "The dealii-openmpi2-devel package contains libraries and header files for \
developing applications that use dealii-openmpi2."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi2-devel-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "8515d5fc97a78939c62c3f14ba6215930775d1a8c839fd2e7ee125401e7adf742a2accb363b4f1e7fcf98e68b35c3a1a4b128787a00be925371775c91210bc99"

RPROVIDES:${PN} += "deal_II-openmpi2-devel \
deal_II-openmpi2-devel(aarch-64) \
dealii-openmpi2-openmpi2-devel"
RDEPENDS:${PN} += "libdeal_II9_4_2-openmpi2"

inherit rpm
