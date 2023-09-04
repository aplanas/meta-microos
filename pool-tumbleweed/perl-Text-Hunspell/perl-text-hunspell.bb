SUMMARY = "Perl interface to the Hunspell library"
DESCRIPTION = "This module provides a Perl interface to the *Hunspell* library. This \
module is to meet the need of looking up many words, one at a time, in a \
single session, such as spell-checking a document in memory. \
 \
The example code describes the interface on http://hunspell.sf.net"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.16"

RPM_NAME = "perl-Text-Hunspell-2.16-1.5.aarch64.rpm"
RPM_HASH = "8b05098c52293dc40d9a447e577aac7998884fbcc233b2b45eebe91767b991ebee1e88a88d91d15ef2aad0fd54e475967587d0ca61ee5a995409c9efb51b6aa7"

RPROVIDES:${PN} += "perl-Text--Hunspell \
perl-Text-Hunspell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
