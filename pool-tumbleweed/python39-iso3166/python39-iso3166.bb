SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python39-iso3166-2.1.1-1.3.noarch.rpm"
RPM_HASH = "f3530ce8b0668bfc1ca9e9892d4598eaa0abf18f5d70cc288b5965f77f196e605b6120372f142149667e3b3fa15564a881931a60ca701e714a051880c5926239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(iso3166) \
python39-iso3166 \
python3dist(iso3166)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
