SUMMARY = "Adaptor to make NSS read the p11-kit trust store"
DESCRIPTION = "Adaptor library to make NSS read the p11-kit trust store. It has \
to be installed intead of mozilla-nss-certs."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "p11-kit-nss-trust-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "b326b5f151095b4accb3c760af73378142faea29403b94ef55347a2845f6d9f08b321069b86cfac5a2fae3ae0383d0405b246f8834e5a6abb23e5a41a0bd03c4"

RPROVIDES:${PN} += "libnssckbi.so \
p11-kit-nss-trust"

RDEPENDS:${PN} += "p11-kit"

inherit rpm
