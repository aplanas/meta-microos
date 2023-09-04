SUMMARY = "Windows 'Registry Hive' extraction library"
DESCRIPTION = "Hivex is a library for extracting the contents of Windows 'Registry \
Hive' files. It is designed to be secure against buggy or malicious \
registry files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-1.3.23-2.6.aarch64.rpm"
RPM_HASH = "75c604e82ae2eb3fe540605b180e3cbc6c68c53ae1a0a861a7ebaa178765710ee55ffea3aa62049b5d4e771a75eb6105634528a8423f49056af03e91dd62f35b"

RPROVIDES:${PN} += "hivex"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
libxml2.so.2 \
perl-Getopt--Long \
perl-Pod--Usage \
perl-Win--Hivex \
perl-Win--Hivex--Regedit"

inherit rpm
