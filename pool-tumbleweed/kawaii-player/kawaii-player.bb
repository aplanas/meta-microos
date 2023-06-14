SUMMARY = "Multimedia player, library manager and media server"
DESCRIPTION = "Kawaii-Player is an audio/video manager and multimedia player based on mpv \
and can also work as media server."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0.1"

RPM_NAME = "kawaii-player-5.0.0.1-2.8.noarch.rpm"
RPM_HASH = "de92fe44ddf23e2e58d65cedd353eacad1d3a881c55890ba8614b164880717b15c9de4792dfc998cc908cb9ad1a7667cab3364c9345e081430ea2c91ff05f88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kawaii-player \
python3.10dist-kawaii-player \
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
