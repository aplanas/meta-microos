SUMMARY = "Windows 'Registry Hive' extraction library"
DESCRIPTION = "Hivex is a library for extracting the contents of Windows 'Registry \
Hive' files. It is designed to be secure against buggy or malicious \
registry files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "591d540c85837b786a9e60abca733526517a1b174374d0798a0d9893f5481ef6aa45587393624b451e59aab0b2f0c2d78f5bfcd56c7915f0a2f62cdf2d7c23cf"

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
