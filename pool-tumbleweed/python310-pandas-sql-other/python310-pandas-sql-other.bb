SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-sql-other-2.0.3-1.2.noarch.rpm"
RPM_HASH = "abc5543667370ad1d8d9979c4bb50f5112df723f4c25992bf32306b25b13d7526304b231879d54b427b5a0747a6d55586cd630fa7038ad0255f7df0f04139070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-sql-other"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas"

inherit rpm
