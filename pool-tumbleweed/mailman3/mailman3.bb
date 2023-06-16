SUMMARY = "A mailing list manager"
DESCRIPTION = "Mailman is a mailing list manager from the GNU project."
LICENSE = "GPL-3.0-only"

PV = "3.3.8"

RPM_NAME = "mailman3-3.3.8-2.1.noarch.rpm"
RPM_HASH = "2ef10da5b62f6ab89be7a380d9490194ced346f7f8c088ce3c7669b96fc6a5a7e4aa93a1aa35087977e6f4491dc7f552bffc96cf3466f47fecff1073fa076572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-mailman3 \
mailman \
mailman3 \
python3.9dist-mailman \
python39-mailman \
python3dist-mailman"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
logrotate \
python-abi \
python39-SQLAlchemy \
python39-aiosmtpd \
python39-alembic \
python39-atpublic \
python39-authheaders \
python39-authres \
python39-click \
python39-dnspython \
python39-falcon \
python39-flufl.bounce \
python39-flufl.i18n \
python39-flufl.lock \
python39-gunicorn \
python39-importlib-resources \
python39-lazr.config \
python39-passlib \
python39-python-dateutil \
python39-requests \
python39-setuptools \
python39-zope.component \
python39-zope.configuration \
python39-zope.event \
python39-zope.interface \
update-alternatives"

inherit rpm
