SUMMARY = "Polls system event logs (SEL)"
DESCRIPTION = "The daemon  polls  the system event log (SEL) of specified hosts and stores the \
logs into the local syslog. By default, the daemon can also make best efforts \
to manage the remote SEL buffer to ensure events are never lost. \
Recent logging data will be cached to disk to ensure that SEL events are \
not missed in the event the client or server is rebooted."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.10"

RPM_NAME = "freeipmi-ipmiseld-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "6468fc3843f8e02f913d81b01092483ce0292ee56ed2ad819390ee36cfb229a3e53a175151201f6894f60ef64d887b2abdbecf7343640f740f9199ef2fc231f2"

RPROVIDES:${PN} += "config(freeipmi-ipmiseld) \
freeipmi-ipmiseld \
freeipmi-ipmiseld(aarch-64) \
freeipmi:/usr/sbin/ipmiseld"

RDEPENDS:${PN} += "/bin/sh \
freeipmi \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libfreeipmi.so.17()(64bit) \
systemd"

inherit rpm
