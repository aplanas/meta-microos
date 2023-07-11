SUMMARY = "Very Secure FTP Daemon - Written from Scratch"
DESCRIPTION = "Vsftpd is an FTP server, or daemon. The 'vs' stands for Very Secure. \
Obviously this is not a guarantee, but the entire codebase was written \
with security in mind, and carefully designed to be resilient to \
attack. \
 \
Recent evidence suggests that vsftpd is also extremely fast (and this \
is before any explicit performance tuning!). In tests against wu-ftpd, \
vsftpd was always faster, supporting over twice as many users in some \
tests."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "3.0.5"

RPM_NAME = "vsftpd-3.0.5-10.1.aarch64.rpm"
RPM_HASH = "2b11f9a6ef5786b8a7629297cd3101377c8312665278a424192101fe570d023abd01d1cd1d0f7b3c3071c7ccb4153ffcb76f26feea41bfc0057f7abc9427f774"

RPROVIDES:${PN} += "config-vsftpd \
ftp-server \
vsftpd"

RDEPENDS:${PN} += "/usr/bin/sh \
group-nobody \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libpam.so.0 \
libssl.so.3 \
logrotate \
shadow \
systemd \
user-ftp"

inherit rpm
