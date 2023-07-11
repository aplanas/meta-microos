SUMMARY = "Module for Simple Terminal Control"
DESCRIPTION = "This module, ReadKey, provides ioctl control for terminals and Win32 consoles \
so the input modes can be changed (thus allowing reads of a single character at \
a time), and also provides non-blocking reads of stdin, as well as several \
other terminal related features, including retrieval/modification of the screen \
size, and retrieval/modification of the control characters."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "2.38"

RPM_NAME = "perl-Term-ReadKey-2.38-1.21.aarch64.rpm"
RPM_HASH = "5629c827a0746a0ce5c7bbdcbd5aa42b8f973cedbc503973934deefc5ee51a93591d1fa49defc5ed5a33bab2859aa97f956b4b82be13b57be764e416acdb24c2"

RPROVIDES:${PN} += "perl-Term--ReadKey \
perl-Term-ReadKey \
perl-TermReadKey"

RDEPENDS:${PN} += "/usr/bin/stty \
ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
