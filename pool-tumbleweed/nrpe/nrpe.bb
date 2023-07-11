SUMMARY = "Nagios Remote Plug-In Executor"
DESCRIPTION = "NRPE can be used to run Nagios plugins on a remote machine for \
executing local checks. \
This package contains the software for NRPE server. \
It could be run by an inetd, or as a standalone daemon."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "nrpe-4.0.3-5.5.aarch64.rpm"
RPM_HASH = "469096eecb5a1aba8a48dc8722ae4e782d5868189791d5d6a405caf5466ee09b86273c4ebf1339594d1756ceff623ef17e78fe348099737cb5f3c24ac2c1b2be"

RPROVIDES:${PN} += "config-nrpe \
nagios-nrpe \
nagios-nrpe-client \
nrpe"

RDEPENDS:${PN} += "/usr/bin/logger \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
grep \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libnss-usrfiles2 \
libssl.so.3 \
libwrap.so.0 \
netcfg \
pwdutils \
sed"

inherit rpm
