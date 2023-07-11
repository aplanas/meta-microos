SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python310-pandas-postgresql-2.0.2-4.1.noarch.rpm"
RPM_HASH = "e8cf98251368032b0590aa5282cbfebc923665f105f19c0d6442ec6f8c7f742919c2643aed44b55215f058dd63ed91835610d2331b5e61931fbe70c8d59e815a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-postgresql"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas \
python310-psycopg2"

inherit rpm
