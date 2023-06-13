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

RPROVIDES:${PN} += "config(shibboleth-sp) \
shibboleth-sp \
shibboleth-sp(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libapr-1.so.0()(64bit) \
libaprutil-1.so.0()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
liblog4shib.so.2()(64bit) \
libmemcached.so.11()(64bit) \
libodbc.so.2()(64bit) \
libsaml.so.12()(64bit) \
libshibsp-lite.so.11()(64bit) \
libshibsp.so.11()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libxerces-c-3.2.so()(64bit) \
libxmltooling-lite.so.10()(64bit) \
libxmltooling.so.10()(64bit) \
opensaml-schemas \
openssl \
shadow \
systemd \
xmltooling-schemas"

inherit rpm
