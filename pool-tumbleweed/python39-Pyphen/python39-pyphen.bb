SUMMARY = "Pure Python module to hyphenate text"
DESCRIPTION = "Pyphen is a pure Python module to hyphenate text using existing Hunspell \
hyphenation dictionaries. \
 \
This module is a fork of python-hyphenator, written by Wilbert Berendsen."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MPL-1.1"

PV = "0.10.0"

RPM_NAME = "python39-Pyphen-0.10.0-1.12.noarch.rpm"
RPM_HASH = "f009ea8ba090304260789b1f6db4f20c2bbdeacab1b37ef4b159dc487c1f4c2b0af863f755f8a3dc169d3899a48afce42090cf4cfd95912bfeca2398c23b0e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyphen \
python39-Pyphen \
python3dist-pyphen"

RDEPENDS:${PN} += "python-abi"

inherit rpm
