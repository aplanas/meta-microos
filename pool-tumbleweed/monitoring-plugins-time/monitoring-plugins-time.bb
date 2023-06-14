SUMMARY = "Check the time on the specified host"
DESCRIPTION = "This plugin will check the time on the specified host."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-time-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "885f12e55c8ecad4ae3c0ee441185d6bfd333ea6f56b04bec7da11ff54413a4c5e2099bdcf8ee0d2e4e8875855d7fc5d7735eafc89264c470836184b0d1ef0fe"

RPROVIDES:${PN} += "monitoring-plugins-time \
nagios-plugins-time"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
