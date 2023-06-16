SUMMARY = "A Lightweight, Fast, and Secure FTP Server"
DESCRIPTION = "Pure-FTPd is a fast, production-quality, and standard-conforming FTP \
server, based-on Troll-FTPd. Unlike other popular FTP servers, it has \
no known security flaws, is trivial to set up, and is especially \
designed for modern Linux kernels (setfsuid and sendfile capabilities) \
. Features include: PAM support, IPv6, chroot()ed home directories, \
virtual domains, built-in LS, anti-warez system, bandwidth throttling, \
FXP, bounded ports for passive downloads, upload and download ratios, \
Apache log files, and more."
LICENSE = "BSD-3-Clause"

PV = "1.0.51"

RPM_NAME = "pure-ftpd-1.0.51-2.1.aarch64.rpm"
RPM_HASH = "55e7130e7537a39ae9da66e141c6407a63f54196f1e121853b5e1a45b76570b504ac346aa18600c77e3fa8f7c36121a036aa71eb2336902ae3644fa697625336"

RPROVIDES:${PN} += "config-pure-ftpd \
ftp-server \
pure-ftpd \
pureftpd"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypt.so.1 \
libcrypto.so.3 \
libldap.so.2 \
libmariadb.so.3 \
libpam.so.0 \
libpq.so.5 \
libsodium.so.23 \
libssl.so.3 \
systemd \
user-ftp"

inherit rpm
