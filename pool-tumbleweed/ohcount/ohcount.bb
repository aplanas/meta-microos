SUMMARY = "The Ohloh source code line counter"
DESCRIPTION = "Ohcount counts lines of source code. It supports over 70 programming \
languages, and has been used to count over 6 billion lines of code by \
300,000 developers. Ohcount can also detect open source licenses such \
as GPL within a large directory of source code. It can further detect \
code that targets a particular programming API, such as Win32 or KDE."
LICENSE = "GPL-2.0"

PV = "4.0.0"

RPM_NAME = "ohcount-4.0.0-2.13.aarch64.rpm"
RPM_HASH = "c956570b60f4b6c80d28d469e455a40c27dab0a4b84cec94120bb293243c31c49f1f12a5f1818ef18f429e283eef0b3dd3956aa729aba82b9576e5624cad4e74"

RPROVIDES:${PN} += "ohcount \
ohcount(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmagic.so.1()(64bit) \
libpcre.so.1()(64bit)"

inherit rpm
