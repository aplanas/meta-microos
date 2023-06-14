SUMMARY = "The Common UNIX Printing System"
DESCRIPTION = "CUPS is a modular printing system which allows a computer to act as a \
print server. A computer running CUPS is a host that can accept print \
jobs from client computers, process them, and send them to the \
appropriate printer. \
 \
CUPS consists of a print spooler and scheduler, a filter system that \
converts the print data to a format that the printer will understand, \
and a backend system that sends this data to the print device. CUPS \
uses the Internet Printing Protocol (IPP) as the basis for managing \
print jobs and queues. It also provides the traditional command line \
interfaces for the System V and Berkeley print systems, and provides \
support for the Berkeley print system's Line Printer Daemon protocol \
and limited support for the server message block (SMB) protocol. \
 \
CUPS comes with a built-in web-based interface."
LICENSE = "Apache-2.0"

PV = "2.4.2"

RPM_NAME = "cups-2.4.2-5.1.aarch64.rpm"
RPM_HASH = "612d6e7f53066c80d50f63c82318b1143fed0dbd9e69741abad78dbbffefadc70a7b8661da4137fcfae4601da767e095c177a2c870297c8bbb323f88eff95e0e"

RPROVIDES:${PN} += "config-cups \
cups"

RDEPENDS:${PN} += "/bin/bash \
/usr/sbin/groupadd \
coreutils \
cups-client \
cups-config \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libgssapi-krb5.so.2 \
libm.so.6 \
libpam.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libusb-1.0.so.0 \
systemd"

inherit rpm
