SUMMARY = "Python ISO 3166-1 country definitions"
DESCRIPTION = "ISO 3166-1 defines two-letter, three-letter, and three-digit country \
codes. `python-iso3166` is a self-contained module that converts \
between these codes and the corresponding country name."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python310-iso3166-2.1.1-1.3.noarch.rpm"
RPM_HASH = "37bba7f106aeef507ed0d49f776ed4665a2fdf65ea374c70ec5d9a0c5a52f8141b41f34731df2b46edc971c5e0e39a2f916348cc3ed57c44cd7371f51dc29cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-iso3166 \
python3.10dist(iso3166) \
python310-iso3166 \
python3dist(iso3166)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
