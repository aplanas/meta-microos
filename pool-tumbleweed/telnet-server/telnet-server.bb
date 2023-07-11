SUMMARY = "A Server Program for the Telnet Remote Login Protocol"
DESCRIPTION = "Telnet is a popular protocol for logging into remote systems. This \
package provides the telnet daemon, which will allow remote logins into \
this machine."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-server-1.2-176.4.aarch64.rpm"
RPM_HASH = "311ce1b5eb164e47fe3a3c203e58bd5bbd19a61770247694ae2ee5497ab1ad4e5db873d89b13eebdd45ad296ac466ffe02e5706131ea0b1877da67eebccb7cc7"

RPROVIDES:${PN} += "nkitserv-/usr/sbin/in.telnetd \
telnet-server"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnss-usrfiles2 \
libtinfo.so.6 \
netcfg \
systemd"

inherit rpm
