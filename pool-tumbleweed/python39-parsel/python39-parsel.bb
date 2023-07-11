SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python39-parsel-1.7.0-1.5.noarch.rpm"
RPM_HASH = "011fc781b48c097479bccdd35188ddd9269eeb11a31f52ea5589074499b862e68d643be8c63b40b6a71a9acfdd218d759e7966df341f0154ce51146834208c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-parsel \
python39-parsel \
python3dist-parsel"

RDEPENDS:${PN} += "python-abi \
python39-cssselect \
python39-lxml \
python39-w3lib"

inherit rpm
