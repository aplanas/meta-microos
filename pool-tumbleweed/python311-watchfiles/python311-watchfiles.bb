SUMMARY = "File watching and code reload in python"
DESCRIPTION = "A package for file watching and code reload in python. \
 \
This package was previously named 'watchgod'."
LICENSE = "MIT"

PV = "0.19.0"

RPM_NAME = "python311-watchfiles-0.19.0-1.2.aarch64.rpm"
RPM_HASH = "5e10e1148a876417a44eb69ac719b5bd0f1331eabdb71bc7677021b497f9b27867ff3b739e08c2c829523e57aed5649f24fded8853f85eb457ae32712a69c68d"

RPROVIDES:${PN} += "python3-watchfiles \
python3.11dist-watchfiles \
python311-watchfiles \
python3dist-watchfiles"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
python-abi \
python311-anyio \
update-alternatives"

inherit rpm
