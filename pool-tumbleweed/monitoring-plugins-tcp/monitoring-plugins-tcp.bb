SUMMARY = "Tests TCP and UDP connections"
DESCRIPTION = "This plugin tests TCP connections with the specified host (or unix socket). \
 \
This package contains the following checks: \
* check_clamd \
* check_ftp \
* check_imap \
* check_jabber \
* check_nntp \
* check_nntps \
* check_pop \
* check_simap \
* check_spop \
* check_ssmtp \
* check_tcp \
* check_udp"
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-tcp-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "9eadb9067f6f1f5eba4a05c2bf6b42005f93391ef3015484d9592062bb9ffcd6d34d1b77c1a678d36b97586f8438889940fb8bad5500ad687d3fe3608b67762f"

RPROVIDES:${PN} += "monitoring-plugins-clamd \
monitoring-plugins-ftp \
monitoring-plugins-imap \
monitoring-plugins-jabber \
monitoring-plugins-nntp \
monitoring-plugins-nntps \
monitoring-plugins-pop \
monitoring-plugins-simap \
monitoring-plugins-spop \
monitoring-plugins-ssmtp \
monitoring-plugins-tcp \
monitoring-plugins-udp \
nagios-plugins-clamd \
nagios-plugins-ftp \
nagios-plugins-imap \
nagios-plugins-jabber \
nagios-plugins-nntp \
nagios-plugins-nntps \
nagios-plugins-pop \
nagios-plugins-simap \
nagios-plugins-spop \
nagios-plugins-ssmtp \
nagios-plugins-tcp \
nagios-plugins-udp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
