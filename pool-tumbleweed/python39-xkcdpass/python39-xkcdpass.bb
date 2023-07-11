SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python39-xkcdpass-1.19.3-2.5.noarch.rpm"
RPM_HASH = "01d311876452e485ec3aea502f14a0ec669505ac10692d33a949d7a04e4a48d9f6e286baec41b874c795d1e2d1e1084dd40642911a19404cbfe189047f79f79a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xkcdpass \
python39-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
