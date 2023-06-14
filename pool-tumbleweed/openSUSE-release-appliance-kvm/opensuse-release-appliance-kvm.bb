SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230604"

RPM_NAME = "openSUSE-release-appliance-kvm-20230604-1684.1.aarch64.rpm"
RPM_HASH = "1e42ff65587dc2e2ab8670b2f90b3937d903cb101b4388dcdecfaceb801aa332fa4c32e8bb103ee597b4722b7c2858a71bd72fbd8595098dca9eb7ebb688fb80"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
