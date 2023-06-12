SUMMARY = "The kernel log daemon"
DESCRIPTION = "The klogd daemon 'listens' to kernel log messages, prioritizes them, \
and routes them to either output files or to syslog daemon. \
 \
This version of klogd will optionally translate kernel addresses to \
their symbolic equivalents if provided with a system map."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "klogd-1.5.1-802.3.aarch64.rpm"
RPM_HASH = "70c8185ac1c336d5dbc25cc3d066b22a508aece265ba5d03daffc557bb3cdbbc0b43a4808f284039b252652b6a1720493c9a7c03243ba5c445f9857f5a5c3bfa"

RPROVIDES:${PN} += "klogd \
klogd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
