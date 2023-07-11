SUMMARY = "The python pandas[sql-other] extra"
DESCRIPTION = "This package provides the [sql-other] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python311-pandas-sql-other-2.0.2-4.1.noarch.rpm"
RPM_HASH = "78b86dfeb8c0395b5cab3d98fe9f5561a93f7f272e329633efbbb648d6a96712e7d6b824c0390689fd5c4e1a36fb29b082affb552bede0cfefd0ba02a6283d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-sql-other \
python311-pandas-sql-other"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas"

inherit rpm
