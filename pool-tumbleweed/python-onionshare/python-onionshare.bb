SUMMARY = "Self-hosting Tor Onion Service based file sharing"
DESCRIPTION = "OnionShare lets the user share files securely and anonymously. It \
works by starting a web server, making it accessible as a Tor Onion \
Service, and generating an unguessable URL to access and download the \
files. It does not require setting up a separate server or using a \
third party file-sharing service. Files are hosted on the machine the \
program is run on. The receiving user just needs to open the URL in \
Tor Browser to download the file."
LICENSE = "GPL-3.0-or-later"

PV = "2.6"

RPM_NAME = "python-onionshare-2.6-2.1.noarch.rpm"
RPM_HASH = "ea60867a561176583b8e46dc610e18f057a7e484d1016be3d52175c976f39d6d4e55e3a3707dad084e07261bfdea242a41839508dc370d9c3caf6099e639e4d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-onionshare \
python-onionshare-2.6 \
python3.10dist-onionshare \
python3.10dist-onionshare-cli \
python3dist-onionshare \
python3dist-onionshare-cli"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Flask \
python3-Flask-SocketIO \
python3-PyNaCl \
python3-PySocks \
python3-Unidecode \
python3-cepa \
python3-colorama \
python3-eventlet \
python3-psutil \
python3-pyside2 \
python3-qrcode \
python3-requests \
python3-urllib3 \
tor"

inherit rpm
