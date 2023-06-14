SUMMARY = "Postorius - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.7"

RPM_NAME = "postorius-web-uwsgi-1.3.7-1.3.noarch.rpm"
RPM_HASH = "e8f3673bd344fc935aeb94c82ec8a9ec68f4efd1a2398f87b696fe195a0ca2cf089eceab41aa25ca650bed79f627ed219b5d7a3f77464ee36dd40fc2c3e69e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postorius-web-uwsgi \
postorius-web-uwsgi"

RDEPENDS:${PN} += "postorius-web \
python39-uwsgi-python3"

inherit rpm
