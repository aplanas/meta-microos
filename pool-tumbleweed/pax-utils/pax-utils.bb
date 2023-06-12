SUMMARY = "Tools to Check ELF Files for Security Relevant Properties"
DESCRIPTION = "Tools to check ELF files for security relevant properties such as \
non-executable stack."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.7"

RPM_NAME = "pax-utils-1.3.7-1.3.aarch64.rpm"
RPM_HASH = "1d4d5439c9f4db7b8193494e9cfe2d438f6b940d25f40d43f5b9e7b45b10af5aaa16cbd06fb2ba56573ab7e469230b6833e2a9a76d62ce14a6af86bf827065cd"

RPROVIDES:${PN} += "pax-utils \
pax-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcap.so.2()(64bit)"

inherit rpm
