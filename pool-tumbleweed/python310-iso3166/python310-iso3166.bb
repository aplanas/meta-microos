SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-iso3166-2.1.1-1.5.noarch.rpm"
RPM_HASH = "7580e61fd8afaf69b68acd518d9a8e7971b0c352e42ac5172c6f0e71937efd6143fd76387161865a063273435d1b008bf60279ad9e7485d8c42140255847dbaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-iso3166 \
python310-iso3166 \
python3dist-iso3166"

RDEPENDS:${PN} += "python-abi"

inherit rpm
