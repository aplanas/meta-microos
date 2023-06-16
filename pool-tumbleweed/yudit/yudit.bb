SUMMARY = "Unicode text editor"
DESCRIPTION = "yudit is a unicode package to edit and convert text of different \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.7"

RPM_NAME = "yudit-3.0.7-1.12.aarch64.rpm"
RPM_HASH = "ab01fab035f44e8f4ddaebf4bf82e034c128192615cd7761bb82da686fe7e4d0c23563f9543de60ee9703cf315afa25dad293ef9bc16616fc1d6b04913992a91"

RPROVIDES:${PN} += "config-yudit \
yudit"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
perl"

inherit rpm
