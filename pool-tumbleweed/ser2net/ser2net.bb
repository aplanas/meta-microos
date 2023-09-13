SUMMARY = "Serial port to network proxy"
DESCRIPTION = "ser2net provides a way for a user to connect from a network connection to a \
serial port. It provides all the serial port setup, a configuration file to \
configure the ports, a control login for modifying port parameters, \
monitoring ports, and controlling ports."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.0"

RPM_NAME = "ser2net-4.5.0-1.1.aarch64.rpm"
RPM_HASH = "35f3fe6cdb74be1f252dec66cd9d0563df3164af7c18c0cc3ef2086edd5d3fd93c59ab7fd4fc9f078c5f8e3950e08fc7510c20ab38c889ef49be3bdb04f0c7a3"

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
