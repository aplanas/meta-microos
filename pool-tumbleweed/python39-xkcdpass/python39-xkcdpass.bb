SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python39-xkcdpass-1.19.3-2.3.noarch.rpm"
RPM_HASH = "015702055cb71ab08d0fe3882bb961e123e7ee22a834d5499d3abfa2fbda69d04fb8734b2f2933f3deabd8626fdba883d3f87d20d5a00c5d6c3a5ebc04fb7213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xkcdpass) \
python39-xkcdpass \
python3dist(xkcdpass)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
update-alternatives"

inherit rpm
