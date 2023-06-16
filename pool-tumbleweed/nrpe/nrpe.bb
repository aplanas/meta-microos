SUMMARY = "Nagios Remote Plug-In Executor"
DESCRIPTION = "NRPE can be used to run Nagios plugins on a remote machine for \
executing local checks. \
This package contains the software for NRPE server. \
It could be run by an inetd, or as a standalone daemon."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.3"

RPM_NAME = "nrpe-4.0.3-5.3.aarch64.rpm"
RPM_HASH = "9f9de56d85602ea7da0ffd07420c2c9828e5859ace2eabc9a084c437a2799c534fc74ef9d5e29614a01f419b2c0de9a863bd2cafc7645a78b47a924dcf9c8b90"

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
