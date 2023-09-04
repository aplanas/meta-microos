SUMMARY = "Berkeley Open Infrastructure For Network Computing library"
DESCRIPTION = "The Berkeley Open Infrastructure for Network Computing (BOINC) is a \
software platform which supports distributed computing."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.24.1"

RPM_NAME = "libboinc7-7.24.1-1.1.aarch64.rpm"
RPM_HASH = "82cf003178f4f2489d21f490a323ece42ad81ae4e3b82eaa88e21ea47826e14748f09076208aac805f0c1c295aafe7494b1ba39b0c3c2ee6d4247beeaa7f0413"

RPROVIDES:${PN} += "libboinc-crypt.so.7 \
libboinc.so.7 \
libboinc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
