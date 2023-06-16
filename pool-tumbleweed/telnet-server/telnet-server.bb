SUMMARY = "A Server Program for the Telnet Remote Login Protocol"
DESCRIPTION = "Telnet is a popular protocol for logging into remote systems. This \
package provides the telnet daemon, which will allow remote logins into \
this machine."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-server-1.2-176.3.aarch64.rpm"
RPM_HASH = "7a5f061c27126be12b629ab429d05d32913ad669935e7b641ac827efbda37c3343a8166eeb6b00e6de01b68e2c3544b01dff854a28675f222372f326655ef3a6"

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
