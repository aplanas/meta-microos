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

RPM_NAME = "vsftpd-3.0.5-9.2.aarch64.rpm"
RPM_HASH = "d8fba546c068d4a9c3145e3c549cb8d4102c557d2840cbd4fed1c689c985b0422a595c41b8839ad52d8691cf2ad4ebecdd60ab6271da37ac326732480643c0a6"

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
