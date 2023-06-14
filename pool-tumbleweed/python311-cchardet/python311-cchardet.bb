SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python311-cchardet-2.1.18-1.4.aarch64.rpm"
RPM_HASH = "1b91c3507172efaf25b21604d7d6b8a2e0359de0b302d869fdcb818996920d425946260ec61a074ab895f94ea74ccbaec6119a3c62bd4552214b6942b96c1d33"

RPROVIDES:${PN} += "python3.11dist-faust-cchardet \
python311-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
