SUMMARY = "Virtual Organization Membership Service Development Files"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides header files for programming with the VOMS libraries."
LICENSE = "Apache-2.0"

PV = "2.1.0~rc3"

RPM_NAME = "voms-devel-2.1.0~rc3-1.3.aarch64.rpm"
RPM_HASH = "042d73b3c2c2b2e3566f9e4e12f088d5a2c4cc8e33a90d56c6a1061463796b2fb2b6b194cdf3e3751b366e30821ef320f04e2d0c7309c8a875012c19c05ff442"

RPROVIDES:${PN} += "pkgconfig-voms-2.0 \
voms-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
automake \
libopenssl-devel \
libvomsapi1 \
pkgconfig-openssl"

inherit rpm
