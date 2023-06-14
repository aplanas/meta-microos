SUMMARY = "Check SMTP connections"
DESCRIPTION = "This plugin will attempt to open an SMTP connection with the given host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-smtp-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "8bf3bcd074b43131b25f297095bf45b501566f18f4c86104c003b15b633c07cdafb94b49f455d13ff3a42ce7d2169a5b9692cfa41cc8d76cc060cf3410bff0d7"

RPROVIDES:${PN} += "monitoring-plugins-smtp \
nagios-plugins-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
