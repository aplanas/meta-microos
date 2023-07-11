SUMMARY = "Open source Church presentation and lyrics projection application"
DESCRIPTION = "OpenLP is a church presentation software, for lyrics projection software, \
used to display slides of Songs, Bible verses, videos, images, and \
presentations via LibreOffice using a computer and projector."
LICENSE = "GPL-2.0-only"

PV = "3.0.2"

RPM_NAME = "OpenLP-3.0.2-1.3.noarch.rpm"
RPM_HASH = "6918e3e5d8169f702951108db4be4e96047ce94231a4a642e74909da845a874f9546c3c2f960aeb2ef6d161cbcb793cf24d0315acf6f56342ab7d49952131f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenLP \
python3.11dist-openlp \
python3dist-openlp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
hicolor-icon-theme \
python-abi \
python3-Mako \
python3-SQLAlchemy \
python3-alembic \
python3-beautifulsoup4 \
python3-chardet \
python3-lxml \
python3-pyenchant \
python3-qt5 \
python3-xdg \
shared-mime-info"

inherit rpm
