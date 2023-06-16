SUMMARY = "Open source Church presentation and lyrics projection application"
DESCRIPTION = "OpenLP is a church presentation software, for lyrics projection software, \
used to display slides of Songs, Bible verses, videos, images, and \
presentations via LibreOffice using a computer and projector."
LICENSE = "GPL-2.0-only"

PV = "3.0.2"

RPM_NAME = "OpenLP-3.0.2-1.2.noarch.rpm"
RPM_HASH = "5011a560fd1c54d2f0deb552e5425a9de142583e9e9d208e35f734bb5626fc8f13f373bea908b343afd16fb1b5ab49b7db23a499c15a992cc62b580b3a1786d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "OpenLP \
python3.10dist-openlp \
python3dist-openlp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
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
