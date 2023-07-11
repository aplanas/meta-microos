SUMMARY = "A flexible and scriptable password generator which generates strong passphrases"
DESCRIPTION = "A flexible and scriptable password generator which generates strong passphrases, \
inspired by XKCD 936 (https://xkcd.com/936/)"
LICENSE = "BSD-3-Clause"

PV = "1.19.3"

RPM_NAME = "python311-xkcdpass-1.19.3-2.5.noarch.rpm"
RPM_HASH = "6e5561f724d805ab06b6a11e0f8a2d074e145cb67e15fa283440869a7dd2e8b6da3c40238595436a4dc9f6ba15e55287a48565ac334cfcb0f213b038f6e43ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xkcdpass \
python3.11dist-xkcdpass \
python311-xkcdpass \
python3dist-xkcdpass"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
