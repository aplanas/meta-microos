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

RPM_NAME = "python39-snowballstemmer-2.2.0-2.2.noarch.rpm"
RPM_HASH = "acdaf90a353c603b4b52f5cd5bb71e6094e7a5182ec3b274f134237fae24e78133fb80d5381b8e76d927eaac8131e4d75f2c4b34429e882356b9c581e3585a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-snowballstemmer \
python39-snowballstemmer \
python3dist-snowballstemmer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
