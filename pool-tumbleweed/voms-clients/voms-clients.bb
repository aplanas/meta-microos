SUMMARY = "Virtual Organization Membership Service Clients"
DESCRIPTION = "The Virtual Organization Membership Service (VOMS) is an attribute authority \
which serves as central repository for VO user authorization information, \
providing support for sorting users into group hierarchies, keeping track of \
their roles and other attributes in order to issue trusted attribute \
certificates and SAML assertions used in the Grid environment for \
authorization purposes. \
 \
This package provides command line applications to access the VOMS services."
LICENSE = "Apache-2.0"

PV = "2.1.0~rc3"

RPM_NAME = "voms-clients-2.1.0~rc3-1.4.aarch64.rpm"
RPM_HASH = "01730f18e88cacd9dcdea99c475f0789540f205f037e3932368fed7415907a90420d83a25b0bf3e866fa87290203aba26bc5a34cd972b8a7c61b8276a81e631e"

RPROVIDES:${PN} += "voms-clients"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libvomsapi.so.1 \
libvomsapi1 \
update-alternatives"

inherit rpm
