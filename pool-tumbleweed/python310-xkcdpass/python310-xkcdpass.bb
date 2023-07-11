SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python310-xkcdpass-1.19.3-2.5.noarch.rpm"
RPM_HASH = "03cb7e2b0fb529f9afcf80d091dc73bddb59b95f266af510baffbca19027361b8588df128fb1604f2acf3cc347303c9dd716dadbbbc6a3aa05891b009ec91a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xkcdpass \
python310-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
