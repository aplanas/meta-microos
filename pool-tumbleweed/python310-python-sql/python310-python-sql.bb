SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python310-python-sql-1.4.0-1.6.noarch.rpm"
RPM_HASH = "6d2cff41338a89215d432b37b7380ba247b0484cde6a137d6fdcab4e3780b61c1ef57594aeed31748297fcf43b096217c9a220c025b52cc53f30bde405f91893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-sql \
python310-python-sql \
python3dist-python-sql"

RDEPENDS:${PN} += "python-abi"

inherit rpm
