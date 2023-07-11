SUMMARY = "CChardet is high speed universal character encoding detector"
DESCRIPTION = "cChardet is high speed universal character encoding detector. - binding to `uchardet`_."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MPL-1.1"

PV = "2.1.18"

RPM_NAME = "python310-cchardet-2.1.18-2.1.aarch64.rpm"
RPM_HASH = "50841fd528ad76ec2c026108cad3c08a53bc36ced97e5c0c7078bd7f8768188bd4add0e70521ace62a2d5feacc250c6b16133d9784ac2d83ef237b956ea73062"

RPROVIDES:${PN} += "python3.10dist-faust-cchardet \
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
