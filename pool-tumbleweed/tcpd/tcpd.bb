SUMMARY = "A security wrapper for TCP daemons"
DESCRIPTION = "This package contains a small daemon program that can monitor and \
filter incoming requests for finger, ftp, telnet, rlogin, rsh, exec, \
tftp, talk, and other network services."
LICENSE = "BSD-3-Clause"

PV = "7.6"

RPM_NAME = "tcpd-7.6-895.3.aarch64.rpm"
RPM_HASH = "31110d03c6169d4ad1536a1abff0e0fcbe9db3235491e03a1e86ef8a67b0f965211e7c4efddd2a618889f5005894338f52117fcdc0745ee674cc61b2e006e11c"

RPROVIDES:${PN} += "nkitb-/usr/sbin/tcpd \
tcpd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwrap.so.0"

inherit rpm
