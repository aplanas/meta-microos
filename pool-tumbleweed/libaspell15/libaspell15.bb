SUMMARY = "GNU Aspell Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the aspell library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "libaspell15-0.60.8-5.4.aarch64.rpm"
RPM_HASH = "14f3c9f13ad77693587d8a2f55c2e444896154d71303098f788b6e6670594365dde0523da52dc0d20411c1bd377a2329e81a738a712e0af45552a7e01526c5b3"

RPROVIDES:${PN} += "libaspell.so.15 \
libaspell15"

RDEPENDS:${PN} += "/bin/sh \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
