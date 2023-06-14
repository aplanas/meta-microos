SUMMARY = "Precision Time Protocol v2 daemon"
DESCRIPTION = "This software is an implementation of the Precision Time Protocol (PTP) \
according to the IEEE1588 standard for Linux."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "linuxptp-3.1.1-2.8.aarch64.rpm"
RPM_HASH = "903482167312a724f2ed630d94aa77b56ec8c40def291335ff73394134e022150e070c9ad2ed6524c5aee07368c9d0aed1e32f5ae1b88a944f0fd148d9a6dbff"

RPROVIDES:${PN} += "config-linuxptp \
linuxptp \
ptp-timekeeping"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
systemd"

inherit rpm
