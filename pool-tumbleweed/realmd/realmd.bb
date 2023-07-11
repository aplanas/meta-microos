SUMMARY = "AD integration detection"
DESCRIPTION = "This packages contains realmd. \
 \
Realmd is an on demand system DBus service, which allows \
callers to configure network authentication and domain \
membership in a standard way. realmd discovers information \
about the domain or realm automatically and does not require \
complicated configuration in order to join a domain or realm. \
 \
realmd configures sssd or winbind to do the actual network \
authentication and user account lookups."
LICENSE = "LGPL-2.1-or-later"

PV = "0.17.1"

RPM_NAME = "realmd-0.17.1-1.4.aarch64.rpm"
RPM_HASH = "366647241ada0b0999284fc5b7bc880444d3b791489f2c0bfeb1a3a623e089b57b8e8d18d70773a0650f7f533b32c60ff923f124b37e844446ff5baa8bc3f9cf"

RPROVIDES:${PN} += "config-realmd \
realmd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libpolkit-gobject-1.so.0 \
systemd"

inherit rpm
