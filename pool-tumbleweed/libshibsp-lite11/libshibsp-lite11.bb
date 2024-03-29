SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libshibsp-lite11-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "f2ac81402e58030f5f291e3aeeda4fca28848ba98095fa09a224ccca76d530a6c3a108b4c938e815988e879fce1381b8ad5fc3204fe39acefbe9f58698516a30"

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
