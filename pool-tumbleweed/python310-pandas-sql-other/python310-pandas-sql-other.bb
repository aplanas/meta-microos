SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-sql-other-2.0.2-4.1.noarch.rpm"
RPM_HASH = "fad03117b0946b83c34cd852b9d90f58e3a552f7dd4b05c804242182391c6de00ab6402958efbc92daca13c013744869569d0cddca0ae4d1b054bfd9395173ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-sql-other"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas"

inherit rpm
