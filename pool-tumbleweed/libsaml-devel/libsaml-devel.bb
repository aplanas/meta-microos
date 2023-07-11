SUMMARY = "OpenSAML development Headers"
DESCRIPTION = "OpenSAML is an open source implementation of the OASIS Security Assertion \
Markup Language Specification. It contains a set of open source C++ classes \
that support the SAML 1.0, 1.1, and 2.0 specifications. \
 \
This package includes files needed for development with OpenSAML."
LICENSE = "Apache-2.0"

PV = "3.2.1"

RPM_NAME = "libsaml-devel-3.2.1-1.12.aarch64.rpm"
RPM_HASH = "489c5b8d5f908ec0c159879433e19ffce512986724e2491b24d1424f27833c2e88fcf35ff15ee090afec0f21cd425d7872a5dd6283cc0b12c2c75a5571fc8ee0"

RPROVIDES:${PN} += "libsaml-devel \
opensaml-devel \
pkgconfig-opensaml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4shib-devel \
libsaml12 \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-devel \
pkgconfig-log4shib \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-xmltooling"

inherit rpm
