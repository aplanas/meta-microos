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

RPM_NAME = "python39-snowballstemmer-2.2.0-2.1.noarch.rpm"
RPM_HASH = "db14711852bb7920356072f3dd4f38b73ee9cd4a5b1e8a5fc0c2cacebc9b9fcdeeeb7c38ea5e101a43bae22275a3d1306c92f7ac30e20d5366156bab785be3b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(snowballstemmer) \
python39-snowballstemmer \
python3dist(snowballstemmer)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
