SUMMARY = "Filesystem for mounting FTP hosts using FUSE and libcurl"
DESCRIPTION = "CurlFtpFS is a filesystem for mount yast2-ftp-server (FTP hosts) based \
on fuse (FUSE) and libcurl. Important features are: \
 \
- openssl (SSL support), \
 \
- connecting through squid (tunneling HTTP proxies) \
 \
- automatic reconnect on server timeout. \
 \
 \
 \
Authors: \
-------- \
    Robson Braga Araujo <robsonbraga@gmail.com>"
LICENSE = "GPL-2.0+"

PV = "0.9.2"

RPM_NAME = "curlftpfs-0.9.2-63.29.aarch64.rpm"
RPM_HASH = "1243f0b53d80b87325c641bebccd498a2b7d2855c5791ea49346fd5b46c2b8dc41b9eb6fa2e0f884ef07e9a0fded1af319ad2881c76a5d91680c2680283014c2"

RPROVIDES:${PN} += "curlftpfs"

RDEPENDS:${PN} += "fuse \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libfuse.so.2 \
libglib-2.0.so.0"

inherit rpm
