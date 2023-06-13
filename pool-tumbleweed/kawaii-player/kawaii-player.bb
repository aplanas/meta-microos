SUMMARY = "Multimedia player, library manager and media server"
DESCRIPTION = "Kawaii-Player is an audio/video manager and multimedia player based on mpv \
and can also work as media server."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.0.1"

RPM_NAME = "kawaii-player-5.0.0.1-2.8.noarch.rpm"
RPM_HASH = "de92fe44ddf23e2e58d65cedd353eacad1d3a881c55890ba8614b164880717b15c9de4792dfc998cc908cb9ad1a7667cab3364c9345e081430ea2c91ff05f88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(kawaii-player.desktop) \
kawaii-player \
mimehandler(application/ogg) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/streamingmedia) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/vnd.rn-realmedia-vbr) \
mimehandler(application/x-ogg) \
mimehandler(application/x-smil) \
mimehandler(application/x-streamingmedia) \
mimehandler(audio/AMR) \
mimehandler(audio/aac) \
mimehandler(audio/ac3) \
mimehandler(audio/flac) \
mimehandler(audio/m4a) \
mimehandler(audio/mp1) \
mimehandler(audio/mp2) \
mimehandler(audio/mp3) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpg) \
mimehandler(audio/rn-mpeg) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/wav) \
mimehandler(audio/x-aac) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-mp1) \
mimehandler(audio/x-mp2) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-mpg) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pls) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-windows-pcm) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-shorten) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/webm) \
mimehandler(video/x-avi) \
mimehandler(video/x-fli) \
mimehandler(video/x-flv) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-mpeg2) \
mimehandler(video/x-ms-afs) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvxvideo) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora) \
mimehandler(video/x-theora+ogg) \
python3.10dist(kawaii-player) \
python3dist(kawaii-player)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ffmpegthumbnailer \
python(abi) \
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
