SUMMARY = "Perl interface to the Hunspell library"
DESCRIPTION = "This module provides a Perl interface to the *Hunspell* library. This \
module is to meet the need of looking up many words, one at a time, in a \
single session, such as spell-checking a document in memory. \
 \
The example code describes the interface on http://hunspell.sf.net"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.16"

RPM_NAME = "perl-Text-Hunspell-2.16-1.4.aarch64.rpm"
RPM_HASH = "0de898d65d80cd9c3b2d941bb07b0f42f18e8099cbf0262d4a6b20c593745c8f52bb874b1f75fe242fb711aee4bf1e6be40c19ee7d30b620c8a02c8c7d1edf16"

RPROVIDES:${PN} += "perl-Text--Hunspell \
perl-Text-Hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
