SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libshibsp11-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "c209ef2b4e4af98eca6cc1c4c0e3df7fc6c472362ff090b2c99bfb8ec8d48b77bf44ac108076e2ef19f273c65270db949e2d93d02211d0baf403e36552ba1c27"

RPROVIDES:${PN} += "libshibsp.so.11 \
libshibsp11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libsaml.so.12 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxml-security-c.so.20 \
libxmltooling.so.10"

inherit rpm
