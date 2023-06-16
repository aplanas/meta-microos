SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python39-cchardet-2.1.18-1.4.aarch64.rpm"
RPM_HASH = "7c00456fa2066bb75fd82438d27b7537d21d3c6b42dce4191e83fdc0dbc918192b19bbeac43585ac9cbb86697876d6bd6a6ba277888a46776cf8fa243e089d9c"

RPROVIDES:${PN} += "python3.9dist-faust-cchardet \
python39-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
