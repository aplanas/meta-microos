SUMMARY = "Windows 'Registry Hive' extraction library"
DESCRIPTION = "Hivex is a library for extracting the contents of Windows 'Registry \
Hive' files. It is designed to be secure against buggy or malicious \
registry files."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "28a913443e3afc862e6a26a7e6b421932192bd03fa200520568a0533f7570f29de2165f6da6277743adbec0688fc32500c36a2b504e357409027515641944037"

RPROVIDES:${PN} += "hivex \
hivex(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhivex.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
perl(Getopt::Long) \
perl(Pod::Usage) \
perl(Win::Hivex) \
perl(Win::Hivex::Regedit)"

inherit rpm
