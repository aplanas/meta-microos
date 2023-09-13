SUMMARY = "ANSI color-code highlighting for Pygments"
DESCRIPTION = "An ANSI color-code highlighting lexer for Pygments."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python311-pygments-ansi-color-0.3.0-1.1.noarch.rpm"
RPM_HASH = "d1eadf74134cf4c8ee4c8cdda2f8415d2d0a630dc27758bacc26aa54498c7dc7c20c6d8e2944aed89bf55d1786e69989a95f00e6b77301a1e47c2ad27e867ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pygments-ansi-color \
python3.11dist-pygments-ansi-color \
python311-pygments-ansi-color \
python3dist-pygments-ansi-color"

RDEPENDS:${PN} += "python-abi \
python311-pygments \
python311-setuptools"

inherit rpm
