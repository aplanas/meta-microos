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

RPM_NAME = "vsftpd-3.0.5-11.1.aarch64.rpm"
RPM_HASH = "4a61a3d49dd5d29f9ac58aca5f4ae0cd225032aa1a8cbab5cbb9f6177ceb91b6302d4290f330a9cbeda5b2e7d10f2945b6253e285b935dde08795a387e739ec3"

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
