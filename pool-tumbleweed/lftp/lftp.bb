SUMMARY = "Command Line File Transfer Program"
DESCRIPTION = "LFTP is a reliable shell-like command line FTP client. It can retry \
operations and does reget automatically. It can do several transfers \
simultaneously in the background. With LFTP, you can start a transfer \
in the background and continue browsing that FTP site or another one. \
This is all done in one process. Background jobs are completed in nohup \
mode if you exit or close the modem connection. LFTP has reput, mirror, \
and reverse mirror among its features. Since version 2.0, it also \
supports the HTTP protocol. Other features include IPV6 support, \
context sensitive completion, output redirection to files or to pipe, \
FTP and HTTP proxy support, transfer rate throttling for each \
connection and for all connections in sum, job queueing, job execution \
at specified times, opie and skey support in the FTP protocol, SSL for \
HTTP and FTP, and FXP transfers."
LICENSE = "GPL-3.0-or-later"

PV = "4.9.2"

RPM_NAME = "lftp-4.9.2-2.10.aarch64.rpm"
RPM_HASH = "b6ec5a5cbc2adcbbb28b96b78b7923db2c40e1be7e96c00170114b29464f66244419c02130a57b15226a076af1d08872a9dc6139ed68cc6552c93ae39b014c07"

RPROVIDES:${PN} += "config-lftp \
lftp \
liblftp-jobs.so.0 \
liblftp-network.so \
liblftp-pty.so \
liblftp-tasks.so.0"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libcrypto.so.3 \
libexpat.so.1 \
libgcc-s.so.1 \
libidn2.so.0 \
libm.so.6 \
libreadline.so.8 \
libssl.so.3 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
update-alternatives"

inherit rpm
