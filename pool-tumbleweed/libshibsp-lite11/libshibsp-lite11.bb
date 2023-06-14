SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libshibsp-lite11-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "80bd7646f8a551eafa8cfd8d70c33fe82d7ebbfb0d826a5149f54970bdc8a3fb8a1163ad7064dbf31aa65000a37dbb847305da43cad1f2cd0a7b43a86cf0d2f5"

RPROVIDES:${PN} += "libshibsp-lite.so.11 \
libshibsp-lite11"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libstdc++.so.6 \
libxerces-c-3.2.so \
libxmltooling-lite.so.10"

inherit rpm
