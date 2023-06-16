SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python310-cchardet-2.1.18-1.4.aarch64.rpm"
RPM_HASH = "be80345372ebfd741b9ae599a9870285fd113e7d0502f2c3b517272227b4406406c4a90e4958909b80eceac1e00ea2bc50982e0ee75dc2dd348b60a264649b19"

RPROVIDES:${PN} += "python3-cchardet \
python3.10dist-faust-cchardet \
python310-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
