SUMMARY = "Serial port to network proxy"
DESCRIPTION = "ser2net provides a way for a user to connect from a network connection to a \
serial port. It provides all the serial port setup, a configuration file to \
configure the ports, a control login for modifying port parameters, \
monitoring ports, and controlling ports."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.11"

RPM_NAME = "ser2net-4.3.11-1.4.aarch64.rpm"
RPM_HASH = "9a5a5fb89021979eb84962eb3a0fdc182bc5307424c056cb5a78673b1e7bd74e1c999cf884927452fb2878addea82ed10ba28308fff670673bfa5c8eb0409a66"

RPROVIDES:${PN} += "config-ser2net \
ser2net"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgensio.so.6 \
libgensiomdns.so.6 \
libgensioosh.so.6 \
libyaml-0.so.2 \
systemd"

inherit rpm
