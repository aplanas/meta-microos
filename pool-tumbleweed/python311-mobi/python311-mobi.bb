SUMMARY = "Library for unpacking unencrypted mobi files"
DESCRIPTION = "Python library for unpacking unencrypted mobi files (forked from KindleUnpack)"
LICENSE = "GPL-3.0-only"

PV = "0.3.3"

RPM_NAME = "python311-mobi-0.3.3-1.4.noarch.rpm"
RPM_HASH = "974b01074c15cbd86dd59b4c150b6417d17769bcc41b7366eb02c202b5283ccaa2676b2cff37387c1929c76640ac0d2cc37bfaf675f10fb5b717aafacc9c7e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mobi) \
python311-mobi \
python3dist(mobi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-loguru"

inherit rpm
