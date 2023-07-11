SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python311-Pyphen-0.10.0-1.12.noarch.rpm"
RPM_HASH = "10adf504646a37ff248f68220859be8c6c3a1d099b4a059979bdc064d4b29a07f9384a3a4cc95dd9ba1b628132bbda862f9b486ae573b1499688d4244fa6d51e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pyphen \
python3.11dist-pyphen \
python311-Pyphen \
python3dist-pyphen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
