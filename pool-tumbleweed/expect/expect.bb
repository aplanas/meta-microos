SUMMARY = "A Tool for Automating Interactive Programs"
DESCRIPTION = "Expect is a tool primarily for automating interactive applications, \
such as telnet, ftp, passwd, fsck, rlogin, tip, and more.  Expect \
really makes this stuff trivial.  Expect is also useful for testing \
these applications.  It is described in many books, articles, papers, \
and FAQs.  There is an entire book on it available from O'Reilly."
LICENSE = "SUSE-Public-Domain"

PV = "5.45.4"

RPM_NAME = "expect-5.45.4-6.8.aarch64.rpm"
RPM_HASH = "6678dc3d4feb57b498b114f4939e9d1fba99bf0333c2b35230e24c6575050b7229c995775cbe32fbae6c850bc7755bd6481d76dfe6cd65558ee4204064a96abf"

RPROVIDES:${PN} += "expect \
expect(aarch-64) \
libexpect5.45.4.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libtcl8.6.so()(64bit)"

inherit rpm
