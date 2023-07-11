SUMMARY = "A Tool for Automating Interactive Programs"
DESCRIPTION = "Expect is a tool primarily for automating interactive applications, \
such as telnet, ftp, passwd, fsck, rlogin, tip, and more.  Expect \
really makes this stuff trivial.  Expect is also useful for testing \
these applications.  It is described in many books, articles, papers, \
and FAQs.  There is an entire book on it available from O'Reilly."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-5.45.4-6.9.aarch64.rpm"
RPM_HASH = "baa085b53ac760826cde3c3a69db1be8b8866e942b36e564e9f781d0f62cdcc378292317f223152d8fc2e2f5f6c8ce7b98c0abb4fae3210a1e06d8a23e4c2e38"

RPROVIDES:${PN} += "expect \
libexpect5.45.4.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libtcl8.6.so"

inherit rpm
