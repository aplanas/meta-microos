SUMMARY = "Test program for Voikko spell checker"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a test program for using Voikko spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.2"

RPM_NAME = "voikkospell-4.3.2-1.1.aarch64.rpm"
RPM_HASH = "4ac18600ecf99459991f4593f7b11e357a236c066c2fcd12bf61900c3bbbb5255533aa9ecacd9f8c1a03db476b4288e4ab70eb54dec628f0fd994c6b37e4a8eb"

RPROVIDES:${PN} += "voikkospell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvoikko.so.1 \
libvoikko1"

inherit rpm
