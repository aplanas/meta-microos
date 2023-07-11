SUMMARY = "Multimedia player, library manager and media server"
DESCRIPTION = "Kawaii-Player is an audio/video manager and multimedia player based on mpv \
and can also work as media server."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0.1"

RPM_NAME = "kawaii-player-5.0.0.1-2.9.noarch.rpm"
RPM_HASH = "edb71391be9f434b4a0e213e3b23a18de9ee9f00cd6834e24f157cf4e87b9927656c75aa786c5aaff97170d80a27f87f8e910257332a0706947e891b5121eb04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kawaii-player \
python3.11dist-kawaii-player \
python3dist-kawaii-player"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpegthumbnailer \
python-abi \
python3-Pillow \
python3-base \
python3-beautifulsoup4 \
python3-certifi \
python3-libtorrent-rasterbar \
python3-lxml \
python3-mutagen \
python3-opengl \
python3-pycurl \
python3-pytaglib \
python3-qt5 \
python3-qtwebengine-qt5 \
python3-youtube-dl"

inherit rpm
