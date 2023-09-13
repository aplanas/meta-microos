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

RPM_NAME = "realmd-0.17.1-2.1.aarch64.rpm"
RPM_HASH = "175a9b4ba6142f5e3b617de815c15baa17c3bf7d3c3b34e0bd198ab93f176122d64919eeacca570a977260066ee0dfea1f74d3eefbafc4dc18813eaeff189bda"

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
