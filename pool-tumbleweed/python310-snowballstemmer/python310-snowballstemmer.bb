SUMMARY = "16 stemmer algorithms"
DESCRIPTION = "This package provides 16 stemmer algorithms (15 + Poerter English \
stemmer) generated from Snowball algorithms.  It includes following \
language algorithms: Danish, Dutch, English (Standard, Porter), \
Finnish, French, German, Hungarian, Italian, Norwegian, Portuguese, \
Romanian, Russian, Spanish, Swedish, Turkish. This is a pure Python \
stemming library. If PyStemmer is available, this module uses it to \
accelerate."
LICENSE = "BSD-3-Clause"

PV = "2.2.0"

RPM_NAME = "python310-snowballstemmer-2.2.0-2.1.noarch.rpm"
RPM_HASH = "e35498cbeec4b2f6d7603e9ca73fb252a532184acf5c3e6b76597fc02d8ad33d57e9436b2c83e049be61687f625b24d3ec6608cd511dbfe499be8fbed63a5a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snowballstemmer \
python3.10dist(snowballstemmer) \
python310-snowballstemmer \
python3dist(snowballstemmer)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
