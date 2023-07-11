SUMMARY = "GNU Aspell Library"
DESCRIPTION = "GNU Aspell is a spell checker planned to eventually replace Ispell. It \
can be used as a library or as an independent spell checker. \
 \
This package contains the aspell library."
LICENSE = "GFDL-1.1-or-later & LGPL-2.1-only & HPND & SUSE-BSD-Mark-Modifications"

PV = "0.60.8"

RPM_NAME = "libaspell15-0.60.8-5.5.aarch64.rpm"
RPM_HASH = "7aef986176457049d14f1605f63553493eb8a22ef74bb6347257046bb5b84f94100c93ed90d67da8269fae000bb9b863b7e9f4373633ba1d051406533e545a44"

RPROVIDES:${PN} += "libaspell.so.15 \
libaspell15"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
