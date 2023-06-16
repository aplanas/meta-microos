SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python310-xkcdpass-1.19.3-2.3.noarch.rpm"
RPM_HASH = "86745c992a204b8da0eb52382eeb6c45d43d3ce5cbd5dc42fbe8812698ef9644e5c3eea627b2ab71c6e0ed91a0e4909651c7579140e2ef82f099ec7970d532e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkcdpass \
python3.10dist-xkcdpass \
python310-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
