SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python311-cchardet-2.1.18-2.1.aarch64.rpm"
RPM_HASH = "848b10bf8eb6cbe6266b10b942ef4bf406e76a52a22e7eda4d66a3824b21dd0345c0cfab4445e8f4a91ca3d76d66814e1e7572bfbe20d045d61439bdab921f0e"

RPROVIDES:${PN} += "python3-cchardet \
python3.11dist-faust-cchardet \
python311-cchardet \
python3dist-faust-cchardet"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
update-alternatives"

inherit rpm
