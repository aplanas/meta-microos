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

RPM_NAME = "monitoring-plugins-tcp-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "d687ae0d8e21cb477b5ec03412759b70d153e6df46369fe40339a0d479bcef5827b2e9a5a2998319f000e65e7c3c8a150ecda32c37c0febaa9426e5c469de08e"

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
