SUMMARY = "Module for Simple Terminal Control"
DESCRIPTION = "This module, ReadKey, provides ioctl control for terminals and Win32 consoles \
so the input modes can be changed (thus allowing reads of a single character at \
a time), and also provides non-blocking reads of stdin, as well as several \
other terminal related features, including retrieval/modification of the screen \
size, and retrieval/modification of the control characters."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "2.38"

RPM_NAME = "perl-Term-ReadKey-2.38-1.22.aarch64.rpm"
RPM_HASH = "4d02053bb526b303e2a7b29be42b5d1ea18324e3e76124a9b789fe2640da93e805f523f5820859429242b601a8c517c47089fa5ed892a0a5e6969c6266c489de"

RPROVIDES:${PN} += "perl-Term--ReadKey \
perl-Term-ReadKey \
perl-TermReadKey"

RDEPENDS:${PN} += "/usr/bin/stty \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
