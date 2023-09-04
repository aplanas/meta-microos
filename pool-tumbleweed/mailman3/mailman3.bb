SUMMARY = "A mailing list manager"
DESCRIPTION = "Mailman is a mailing list manager from the GNU project."
LICENSE = "GPL-3.0-only"

PV = "3.3.8"

RPM_NAME = "mailman3-3.3.8-4.1.noarch.rpm"
RPM_HASH = "1f55eeb5ac06b1510c8d03339a7eed3960224b5c18bffa3cd87587256f3aa813ee3daa9acf7696692e77172bfcd835abb197306ec9542edddbda39ae3eec1eda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mailman3 \
mailman \
mailman3 \
python3-mailman \
python3.11dist-mailman \
python311-mailman \
python3dist-mailman"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
logrotate \
python-abi \
python311-SQLAlchemy \
python311-aiosmtpd \
python311-alembic \
python311-atpublic \
python311-authheaders \
python311-authres \
python311-click \
python311-dnspython \
python311-falcon \
python311-flufl.bounce \
python311-flufl.i18n \
python311-flufl.lock \
python311-gunicorn \
python311-importlib-resources \
python311-lazr.config \
python311-passlib \
python311-psycopg2 \
python311-python-dateutil \
python311-requests \
python311-setuptools \
python311-zope.component \
python311-zope.configuration \
python311-zope.event \
python311-zope.interface \
update-alternatives"

inherit rpm
