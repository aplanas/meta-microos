SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python310-typogrify-2.0.7-2.1.noarch.rpm"
RPM_HASH = "88fb25ef4aa381c8a4ea93eca18a227cb651de10e540725dcbc91ef76c94650d4dc963d0ee2fa4a5001562e667456f04a5015e5681739865cc66ff8966d9aeca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-typogrify \
python310-typogrify \
python3dist-typogrify"

RDEPENDS:${PN} += "python-abi \
python310-smartypants"

inherit rpm
