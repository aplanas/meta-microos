SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230910"

RPM_NAME = "openSUSE-release-appliance-kvm-20230910-1810.1.aarch64.rpm"
RPM_HASH = "3a1501cf6382fca07730f10377836b618e2dde9295b9acb88499c6f2edd49d4eb5cdeb23078c8933481e28222f1dca71595444aa2c32eed5f6e4b2f7b62df094"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
