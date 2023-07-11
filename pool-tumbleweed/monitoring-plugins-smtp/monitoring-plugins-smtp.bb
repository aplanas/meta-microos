SUMMARY = "Check SMTP connections"
DESCRIPTION = "This plugin will attempt to open an SMTP connection with the given host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-smtp-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "e972898fc20882e3b64a02cc67e0bbaad70b868f5ce90ed303fa68ea6584e193b5ac0c8e898fa8252618f9990effa83c161bf9200c812d0aef741b6ca5fc724c"

RPROVIDES:${PN} += "monitoring-plugins-smtp \
nagios-plugins-smtp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
