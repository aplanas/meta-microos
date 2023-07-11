SUMMARY = "MNCC to SIP bridge for osmo-nitb"
DESCRIPTION = "Use the osmo-nitb MNCC interface and bridge it to SIP."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "osmo-sip-connector-1.6.0-1.11.aarch64.rpm"
RPM_HASH = "dcd075eebe71ce81d1d923ffa37ccfaeff481e2da77ac60284b599acc2fd8a44022c69da6244ccd2f08457e4985f290ae3500ed213af4272dd3bdaee1cd28215"

RPROVIDES:${PN} += "config-osmo-sip-connector \
osmo-sip-connector"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmovty.so.9 \
libsofia-sip-ua-glib.so.3 \
libsofia-sip-ua.so.0 \
libtalloc.so.2 \
systemd"

inherit rpm
