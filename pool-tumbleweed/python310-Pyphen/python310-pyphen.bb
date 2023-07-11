SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python310-Pyphen-0.10.0-1.12.noarch.rpm"
RPM_HASH = "a1ec262ae0b78656d671c2801b30daaebdaccd985f01cbfe2ee3eb6518126355d122134bbc6147677ce808f285e18f0704ce0ed3a8fdbfdd0df965383479cd0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyphen \
python310-Pyphen \
python3dist-pyphen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
