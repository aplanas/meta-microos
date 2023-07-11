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

RPM_NAME = "libvomsapi1-2.1.0~rc3-1.4.aarch64.rpm"
RPM_HASH = "4071adc94c59fdbeafc0f8161b42e1ccb4a51032f4e6f99012ed730e0e453c7741457c9d3bd171a6b3c44ec31d413d6e338c9672040b164a7a407f177e67d139"

RPROVIDES:${PN} += "libvomsapi.so.1 \
libvomsapi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
