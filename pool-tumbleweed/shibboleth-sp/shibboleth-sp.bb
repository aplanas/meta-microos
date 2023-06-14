SUMMARY = "System for attribute-based Web Single Sign On"
DESCRIPTION = "Shibboleth is a Web Single Sign-On implementations based on OpenSAML \
that supports multiple protocols, federated identity, and the extensible \
exchange of rich attributes subject to privacy controls. \
 \
This package contains the Shibboleth Service Provider runtime libraries, \
daemon, default plugins, and Apache module."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "shibboleth-sp-3.4.1-1.4.aarch64.rpm"
RPM_HASH = "9fbb21773f652c44fb27eeb52e3a62bcaf6e69c8f2e6a91827190f2cdc2cd12490ae01083bb54495138204f48b463e6ea7070caf59dca9f30b425be0dfab2d63"

RPROVIDES:${PN} += "config-shibboleth-sp \
shibboleth-sp"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
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
