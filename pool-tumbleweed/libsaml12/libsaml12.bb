SUMMARY = "Security Assertion Markup Language library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "libsaml12-3.2.1-1.11.aarch64.rpm"
RPM_HASH = "48e42ad8ad3f06773b95346f3e0c361874c4cfbd5e0d23ac7427894feea69ef9bff105a374faa94f4d5492d17357f6d2e29b918903dd956f58990ed47a84119a"

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
