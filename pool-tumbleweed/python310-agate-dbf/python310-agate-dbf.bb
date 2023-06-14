SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python310-agate-dbf-0.2.2-1.10.noarch.rpm"
RPM_HASH = "6f942a5efab69cd981ba5708957d0b32ffeb241d1344fb4bc2ddce8deecaca3430af97535c5a7752bd2fc50037947995e43162348b929a4669ff9a33265ee5d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-dbf \
python3.10dist-agate-dbf \
python310-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python310-agate \
python310-dbfread"

inherit rpm
