SUMMARY = "A Tool for Sending Fax Documents"
DESCRIPTION = "The sendfax part of mgetty. You can use it instead of hylafax for \
sending faxes. The sources are included in the mgetty source package."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.1"

RPM_NAME = "sendfax-1.2.1-9.4.aarch64.rpm"
RPM_HASH = "97a64111027af2629127f5f00b9fd1a6791998c3a2d2d17656582802ae045a161f00963dfc1151aac2464c53fa9815d0745edcca34dc59fe8194f92f7be90482"

RPROVIDES:${PN} += "config-sendfax \
fax-daemon \
sendfax"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
g3utils \
group-uucp \
ld-linux-aarch64.so.1 \
libc.so.6 \
mgetty \
permissions \
shadow"

inherit rpm
