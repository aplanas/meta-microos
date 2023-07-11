SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python39-cchardet-2.1.18-2.1.aarch64.rpm"
RPM_HASH = "9fdfdd28eda7305d886cdf7d41e3a75ba9fd85d62738e83a0a83a19a2b2308dd15cc8cdefddcdecc8381851cc8372e493a9c871084b0a40ef748dc97b5a4284a"

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
