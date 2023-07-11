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

RPM_NAME = "python310-snowballstemmer-2.2.0-2.2.noarch.rpm"
RPM_HASH = "9a306ecbc1258f3d8e431326d904d971ef25394501a51969e0b25ef0ebea0227941d9213a85dde2e97a64f5da8ea3f14156d9aff741038955e5f2dc2c49fbd0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-snowballstemmer \
python310-snowballstemmer \
python3dist-snowballstemmer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
