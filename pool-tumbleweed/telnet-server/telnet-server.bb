SUMMARY = "A Server Program for the Telnet Remote Login Protocol"
DESCRIPTION = "Telnet is a popular protocol for logging into remote systems. This \
package provides the telnet daemon, which will allow remote logins into \
this machine."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "telnet-server-1.2-176.3.aarch64.rpm"
RPM_HASH = "7a5f061c27126be12b629ab429d05d32913ad669935e7b641ac827efbda37c3343a8166eeb6b00e6de01b68e2c3544b01dff854a28675f222372f326655ef3a6"

RPROVIDES:${PN} += "nkitserv:/usr/sbin/in.telnetd \
telnet-server \
telnet-server(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libnss_usrfiles2 \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
netcfg \
systemd"

inherit rpm
