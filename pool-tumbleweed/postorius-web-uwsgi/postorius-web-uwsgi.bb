SUMMARY = "Postorius - uwsgi configuration"
DESCRIPTION = "A web user interface for GNU Mailman. \
 \
This package holds the uwsgi configuration."
LICENSE = "GPL-3.0-only"

PV = "1.3.8"

RPM_NAME = "postorius-web-uwsgi-1.3.8-3.1.noarch.rpm"
RPM_HASH = "32efd9db31fc81effb4e3ee84bbcf9ba64f0c291b1a076db697d9cbcf569281739634949bffc24206543962f5a9c3212624e53049fe09068c137e99aa68aa0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-postorius-web-uwsgi \
postorius-web-uwsgi"

RDEPENDS:${PN} += "postorius-web \
python311-uwsgi-python3"

inherit rpm
