SUMMARY = "Shibboleth Development Headers"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package includes files needed for development with Shibboleth."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "shibboleth-sp-devel-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "749e5b6973ec3129e66ca477495f09189b1c16ef47523eb1424cd4f50aead40364e2a8fe48395fb227a9a2742bc27c9aa7b645341d98aaddc16e403af829ad56"

RPROVIDES:${PN} += "pkgconfig-shibsp \
pkgconfig-shibsp-lite \
shibboleth-sp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblog4shib-devel \
libsaml-devel \
libshibsp-lite11 \
libshibsp11 \
libxerces-c-devel \
libxml-security-c-devel \
libxmltooling-devel \
pkgconfig-krb5-gssapi \
pkgconfig-log4shib \
pkgconfig-opensaml \
pkgconfig-xerces-c \
pkgconfig-xml-security-c \
pkgconfig-xmltooling \
pkgconfig-xmltooling-lite \
shibboleth-sp"

inherit rpm
