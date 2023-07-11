SUMMARY = "The python pandas[clipboard] extra"
DESCRIPTION = "This package provides the [clipboard] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python39-pandas-clipboard-2.0.2-4.1.noarch.rpm"
RPM_HASH = "4d80ae5dc6cb65ac86cbe8cbbd0a9f012779c4d701d087237fced4f35469e1d60c18f5c440b32e38da9444e9034dc3cf84c7eb6355c0795b7831aad67959faab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pandas-clipboard"

RDEPENDS:${PN} += "python39-PyQt5 \
python39-QtPy \
python39-pandas"

inherit rpm
