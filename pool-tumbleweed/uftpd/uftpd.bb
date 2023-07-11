SUMMARY = "A combined TFTP/FTP server"
DESCRIPTION = "uftpd serves both TFTP and FTP without any configuration file, starts \
automatically from the traditional UNIX inetd super server, and is \
tcpwrapped."
LICENSE = "ISC"

PV = "2.15"

RPM_NAME = "uftpd-2.15-1.8.aarch64.rpm"
RPM_HASH = "829900b326402e66cbce779b057306ba6f88cf0b9ab4db06c1a2583b17c065323010653d403c578b548da5f6b67d87f32cb2877f57e755cdfdf32deb0506dbdc"

RPROVIDES:${PN} += "tftp-server \
uftpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libite.so.5 \
libuev.so.3"

inherit rpm
