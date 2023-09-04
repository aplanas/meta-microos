SUMMARY = "The python pandas[postgresql] extra"
DESCRIPTION = "This package provides the [postgresql] extra for python-pandas"
LICENSE = "BSD-3-Clause"

PV = "2.0.3"

RPM_NAME = "python311-pandas-postgresql-2.0.3-1.2.noarch.rpm"
RPM_HASH = "fc313579596b6790ac9eeb2d5e8c47c6e7af1cbbea2fa1f5335ca17d723cd2f9d138447b70674e55b5835c6eadd913938861992a07f741deb72b3088c8d05221"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pandas-postgresql \
python311-pandas-postgresql"

RDEPENDS:${PN} += "python311-SQLAlchemy \
python311-pandas \
python311-psycopg2"

inherit rpm
