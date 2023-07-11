SUMMARY = "System for attribute-based Web Single Sign On"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains the Shibboleth Service Provider runtime libraries, \
daemon, default plugins, and Apache module."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "shibboleth-sp-3.4.1-1.5.aarch64.rpm"
RPM_HASH = "b2ad1eb7916b5fdfab6ac9862bd2c23221c491b792b39506f390f889ef62af8aac6732c9ca8e4c4ce29e91dd6e06d219d792c9bf5934f19de1cdb2f7f9179324"

RPROVIDES:${PN} += "config-shibboleth-sp \
shibboleth-sp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libaprutil-1.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
liblog4shib.so.2 \
libmemcached.so.11 \
libodbc.so.2 \
libsaml.so.12 \
libshibsp-lite.so.11 \
libshibsp.so.11 \
libstdc++.so.6 \
libsystemd.so.0 \
libxerces-c-3.2.so \
libxmltooling-lite.so.10 \
libxmltooling.so.10 \
opensaml-schemas \
openssl \
shadow \
systemd \
xmltooling-schemas"

inherit rpm
