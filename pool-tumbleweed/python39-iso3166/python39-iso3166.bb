SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-iso3166-2.1.1-1.5.noarch.rpm"
RPM_HASH = "2c41d4e8beff7867fccb319ad4f59fb064a7dfd70cb2a26d4460c57684c152e30038e8d16179c0be78687fb3dbb4708a4a20205af342b786feed0170de5d660c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-iso3166 \
python39-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
