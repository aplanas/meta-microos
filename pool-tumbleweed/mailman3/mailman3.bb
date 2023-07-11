SUMMARY = "A mailing list manager"
DESCRIPTION = "Mailman is a mailing list manager from the GNU project."
LICENSE = "GPL-3.0-only"

PV = "3.3.8"

RPM_NAME = "mailman3-3.3.8-3.1.noarch.rpm"
RPM_HASH = "cba6db0be52e3f83405271ef84fb1e07a8beb0103c0bd1573230ad2916640221c0b80a5b38acda601fe3ff3a3ed87320162c56eeb54045eea808d61de003931d"
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
python311-python-dateutil \
python311-requests \
python311-setuptools \
python311-zope.component \
python311-zope.configuration \
python311-zope.event \
python311-zope.interface \
update-alternatives"

inherit rpm
