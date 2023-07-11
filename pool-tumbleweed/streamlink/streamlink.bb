SUMMARY = "Program to pipe streams from services into a video player"
DESCRIPTION = "Streamlink is a command-line utility which pipes video streams from various \
services into a video player, such as VLC. The main purpose of Streamlink is to \
avoid resource-heavy and unoptimized websites, while still allowing the user to \
enjoy various streamed content."
LICENSE = "BSD-2-Clause"

PV = "5.5.1"

RPM_NAME = "streamlink-5.5.1-1.2.noarch.rpm"
RPM_HASH = "65d66e4764b5b5178ad22ce444ba5687a8a7db9b941c14f4fc775ed1673256c5e2b8f1e32bc4be240c61b7e21db8b3117192b0a781b2b3379f3f1582a24f8613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-streamlink \
python3dist-streamlink \
streamlink"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-PySocks \
python3-certifi \
python3-isodate \
python3-lxml \
python3-pycountry \
python3-pycryptodome \
python3-requests \
python3-urllib3 \
python3-websocket-client"

inherit rpm
