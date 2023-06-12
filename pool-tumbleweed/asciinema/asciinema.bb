SUMMARY = "Terminal session recorder"
DESCRIPTION = "Record of terminal sessions and sharing them on the web."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "asciinema-2.2.0-1.2.noarch.rpm"
RPM_HASH = "168a65bf02cd1cb913fdfeb387dd5fe44407b20f31075b5b654d6e0a291fefc585adee9269aeef7194eb9af854a6ed5bfb910621f4a042bc8b4be8c5d84de1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asciinema \
python3.10dist(asciinema) \
python3dist(asciinema)"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
python(abi)"

inherit rpm
