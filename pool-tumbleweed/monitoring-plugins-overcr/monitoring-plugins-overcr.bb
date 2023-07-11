SUMMARY = "Check Over-CR collector daemon"
DESCRIPTION = "This plugin attempts to contact the Over-CR collector daemon running on the \
remote UNIX server in order to gather the requested system information."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-overcr-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "dc720deec74366e40e1c793d23b1d622362826bdae25ee0b96057b8b97a41de1426151f992d94a441294accaa8c0199d510f2f5e7365d083edc5ebf6b7cd47bd"

RPROVIDES:${PN} += "monitoring-plugins-overcr \
nagios-plugins-overcr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
