SUMMARY = "Library to write SQL queries"
DESCRIPTION = "python-sql is a library to write SQL queries in a pythonic way."
LICENSE = "BSD-3-Clause"

PV = "1.4.0"

RPM_NAME = "python311-python-sql-1.4.0-1.5.noarch.rpm"
RPM_HASH = "7af09eb0f9c868a4f0cd9a0c696864d991df47cf5fc612e46f5d07a6a574639ac59ca5f8f3cfee1393ddd9725ddb0f81f399aa69f4d2278ef2efe836c3fcac7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-sql) \
python311-python-sql \
python3dist(python-sql)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
