SUMMARY = "Source code checker for common misspellings"
DESCRIPTION = "codespell fixes common misspellings in text files. It primarily checks \
misspelled words in source code, but it can be used with other files as well."
LICENSE = "GPL-2.0-only"

PV = "2.2.5"

RPM_NAME = "codespell-2.2.5-1.1.noarch.rpm"
RPM_HASH = "baf71cdda0548e83bb28f47c1524f0f964687722d7f6902580c5622b7b318dfbe562e0718f7fbcbee7a12e394850ae31e15141d444648ab19513f836495cc444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codespell \
python3.11dist-codespell \
python3dist-codespell"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-chardet \
python3-setuptools"

inherit rpm
