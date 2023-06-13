SUMMARY = "A Tool for Sending Fax Documents"
DESCRIPTION = "The sendfax part of mgetty. You can use it instead of hylafax for \
sending faxes. The sources are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "sendfax-1.2.1-9.3.aarch64.rpm"
RPM_HASH = "1151c5a47b5cfae78b1c2b20d316a78e0b172fb5c35ea8be820442403c95cc85ccf51e4258056fc2cd5651db9fb06aed9aac08e36d72cae7b11c6c1d8e1e23ee"

RPROVIDES:${PN} += "config(sendfax) \
fax_daemon \
sendfax \
sendfax(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
g3utils \
group(uucp) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
mgetty \
permissions \
shadow"

inherit rpm
