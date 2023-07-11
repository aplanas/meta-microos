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

RPM_NAME = "python311-snowballstemmer-2.2.0-2.2.noarch.rpm"
RPM_HASH = "eefdd0f4dd1e83f71dafe114c6c95c52ccd557b6dc14cff2958619700f9c0323aa6fe0789817d460d7cdaf0c660f9deb49b18375ff2dcea8cacc81302ea126b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-snowballstemmer \
python3.11dist-snowballstemmer \
python311-snowballstemmer \
python3dist-snowballstemmer"

RDEPENDS:${PN} += "python-abi"

inherit rpm
