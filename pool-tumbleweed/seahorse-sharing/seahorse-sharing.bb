SUMMARY = "Sharing of PGP public keys via DNS-SD and HKP"
DESCRIPTION = "This package adds sharing of PGP public keys via DNS-SD and HKP."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "seahorse-sharing-3.8.0-10.9.aarch64.rpm"
RPM_HASH = "eae424f60eb3830bb9cc126c362435f5cb43c6cc8e24f3efaee9596d906db4c362026909757e2b077b9f6c6721c8af11bb395a3a2ff99cc4187db5fc03ea44f0"

RPROVIDES:${PN} += "seahorse-sharing"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgthread-2.0.so.0 \
libgtk-3.so.0 \
libsoup-2.4.so.1"

inherit rpm
