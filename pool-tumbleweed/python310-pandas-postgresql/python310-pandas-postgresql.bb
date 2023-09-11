SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python310-pandas-postgresql-2.0.3-1.3.noarch.rpm"
RPM_HASH = "3ba917a5fa6e855dd4f57446a39f6955c536fe92b9089b1ee8d5b5de45447f68313621d200276b3ed5fd0cce37209ffff88c6b110831a2ff83d31352fa10416f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pandas-postgresql"

RDEPENDS:${PN} += "python310-SQLAlchemy \
python310-pandas \
python310-psycopg2"

inherit rpm
