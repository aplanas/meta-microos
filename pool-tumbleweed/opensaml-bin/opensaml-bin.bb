SUMMARY = "Utilities for OpenSAML library"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package contains the utility programs."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "opensaml-bin-3.2.1-1.12.aarch64.rpm"
RPM_HASH = "e57341622ebcbb49daf6af007fb017ae19192759384ab6d5804b2b26f6bd70566f9bd72e17fb2a4a411ef71825c9f81fe26d69696b7dbfa53203e5a82362d2cb"

RPROVIDES:${PN} += "opensaml-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
liblog4shib.so.2 \
libsaml.so.12 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxmltooling.so.10"

inherit rpm
