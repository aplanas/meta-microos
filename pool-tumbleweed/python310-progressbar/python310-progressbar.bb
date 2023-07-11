SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "LGPL-2.1-or-later | BSD-3-Clause"

PV = "2.5"

RPM_NAME = "python310-progressbar-2.5-3.1.noarch.rpm"
RPM_HASH = "043ee3bc018110f5d804beccf2687b08fb202df4771beefa37c36a87866aa200cd67d0ca0c26b04e8dfa0d57f91d8e6b5a678ca50f4715cb18195400e5c748cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-progressbar \
python310-progressbar \
python3dist-progressbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
