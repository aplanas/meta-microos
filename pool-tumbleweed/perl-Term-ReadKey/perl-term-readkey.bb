SUMMARY = "Module for Simple Terminal Control"
DESCRIPTION = "This module, ReadKey, provides ioctl control for terminals and Win32 consoles \
so the input modes can be changed (thus allowing reads of a single character at \
a time), and also provides non-blocking reads of stdin, as well as several \
other terminal related features, including retrieval/modification of the screen \
size, and retrieval/modification of the control characters."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "2.38"

RPM_NAME = "perl-Term-ReadKey-2.38-1.20.aarch64.rpm"
RPM_HASH = "7fdaeab1b575178893d2bec181d5f2018706dbb4bf78138865018af0921c397c6129e72b479b90e20804165042b5cf76d640bd41606f33e3c369e10690d199b6"

RPROVIDES:${PN} += "perl(Term::ReadKey) \
perl-Term-ReadKey \
perl-Term-ReadKey(aarch-64) \
perl-TermReadKey"

RDEPENDS:${PN} += "/bin/stty \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
