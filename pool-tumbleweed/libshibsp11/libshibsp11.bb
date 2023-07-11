SUMMARY = "Shared Library for Shibboleth"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains just the shared library."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "libshibsp11-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "48a82743327a3327d5c62489c17df51a6f536b27dd50ab856e803524fde83ef88e43906c17ee5cc9b226ca62ef7baf3accc351be158359c17325e8e26ca7f2c7"

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
