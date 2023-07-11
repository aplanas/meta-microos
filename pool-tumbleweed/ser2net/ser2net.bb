SUMMARY = "Serial port to network proxy"
DESCRIPTION = "ser2net provides a way for a user to connect from a network connection to a \
serial port. It provides all the serial port setup, a configuration file to \
configure the ports, a control login for modifying port parameters, \
monitoring ports, and controlling ports."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.11"

RPM_NAME = "ser2net-4.3.11-1.3.aarch64.rpm"
RPM_HASH = "3fbb35d821b34a5d934fbcd4da06e7dcdf21f1e02bab5399a7f0955daaf785620972a4d1a73325e06b7c20f7ad716938a4900f1641ce8b78ead65ae1b200eb70"

RPROVIDES:${PN} += "config-ser2net \
ser2net"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgensio.so.4 \
libgensiomdns.so.0 \
libgensioosh.so.0 \
libyaml-0.so.2 \
systemd"

inherit rpm
