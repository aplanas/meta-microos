SUMMARY = "The Virtual Organisation Membership Service C++ APIs"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides libraries that applications using the VOMS functionality \
will bind to."
LICENSE = "Apache-2.0"

PV = "2.1.0~rc3"

RPM_NAME = "libvomsapi1-2.1.0~rc3-1.3.aarch64.rpm"
RPM_HASH = "3ed1f33bd39def57e40eff39a2bb91bc0cdd4e7bbf792764aec30d4d4eb45ebc8b43c7a18702001d10fd39d940d27e4f63554380a5dbccdae8e917f034d2dff8"

RPROVIDES:${PN} += "libvomsapi.so.1()(64bit) \
libvomsapi1 \
libvomsapi1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libexpat.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
