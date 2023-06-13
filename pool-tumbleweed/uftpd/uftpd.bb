SUMMARY = "A combined TFTP/FTP server"
DESCRIPTION = "uftpd serves both TFTP and FTP without any configuration file, starts \
automatically from the traditional UNIX inetd super server, and is \
tcpwrapped."
LICENSE = "ISC"

PV = "2.15"

RPM_NAME = "uftpd-2.15-1.7.aarch64.rpm"
RPM_HASH = "29adf398526810d86c55110c944de8975567342cbb80fe6a86953e0cf7feeaed737f6655955e66b18dff4cd31a68af80d5001970b96c9ecba4b40fbd6d480f6b"

RPROVIDES:${PN} += "tftp(server) \
uftpd \
uftpd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libite.so.5()(64bit) \
libuev.so.3()(64bit)"

inherit rpm
