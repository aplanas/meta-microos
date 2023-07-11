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

RPM_NAME = "voms-devel-2.1.0~rc3-1.4.aarch64.rpm"
RPM_HASH = "eb0d9be0dad2adc3a6b3a9e2e96edfc0556dd01bfe2e3b3e25725f0469f68df999bd706d35cf4663cccaa2f33f2d6b2280b28281e786332afaf3fa59438e7c67"

RPROVIDES:${PN} += "pkgconfig-voms-2.0 \
voms-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
automake \
libopenssl-devel \
libvomsapi1 \
pkgconfig-openssl"

inherit rpm
