SUMMARY = "Security Assertion Markup Language library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "libsaml12-3.2.1-1.12.aarch64.rpm"
RPM_HASH = "6e8daa2d8ff61e5cf302edcb3cb18044f82515d6b2046b543a2394de3c4a34c31637dd58cda4881456629b89599aed9a0f83f1bb0c53e379ad449e7e523c5df8"

RPROVIDES:${PN} += "libsaml.so.12 \
libsaml12 \
opensaml"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxml-security-c.so.20 \
libxmltooling.so.10"

inherit rpm
