SUMMARY = "A Media Center designed to run on a large number of devices"
DESCRIPTION = " \
EpyMC is a Media Center application written in python that use the Enlightenment Foundation Library as \
the living base."
LICENSE = "GPL-3.0+"

PV = "1.2.0"

RPM_NAME = "epymc-1.2.0-2.18.noarch.rpm"
RPM_HASH = "1208fd6b7bdc4f4e23cacef5db90ee8765d9b46856ff0ba98272b0d013ffb7d85519068b6d11968ab3bc63233c38c83a0a162378c1e89d91c22772bfb38ae588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(epymc.desktop) \
epymc \
mimehandler(application/mxf) \
mimehandler(application/ogg) \
mimehandler(application/ram) \
mimehandler(application/sdp) \
mimehandler(application/smil) \
mimehandler(application/smil+xml) \
mimehandler(application/vnd.ms-wpl) \
mimehandler(application/vnd.rn-realmedia) \
mimehandler(application/x-extension-m4a) \
mimehandler(application/x-extension-mp4) \
mimehandler(application/x-flac) \
mimehandler(application/x-flash-video) \
mimehandler(application/x-matroska) \
mimehandler(application/x-netshow-channel) \
mimehandler(application/x-ogg) \
mimehandler(application/x-quicktime-media-link) \
mimehandler(application/x-quicktimeplayer) \
mimehandler(application/x-shorten) \
mimehandler(application/x-smil) \
mimehandler(application/xspf+xml) \
mimehandler(audio/3gpp) \
mimehandler(audio/AMR) \
mimehandler(audio/AMR-WB) \
mimehandler(audio/ac3) \
mimehandler(audio/basic) \
mimehandler(audio/midi) \
mimehandler(audio/mp4) \
mimehandler(audio/mpeg) \
mimehandler(audio/mpegurl) \
mimehandler(audio/ogg) \
mimehandler(audio/prs.sid) \
mimehandler(audio/vnd.rn-realaudio) \
mimehandler(audio/x-aiff) \
mimehandler(audio/x-ape) \
mimehandler(audio/x-flac) \
mimehandler(audio/x-gsm) \
mimehandler(audio/x-it) \
mimehandler(audio/x-m4a) \
mimehandler(audio/x-matroska) \
mimehandler(audio/x-mod) \
mimehandler(audio/x-mp3) \
mimehandler(audio/x-mpeg) \
mimehandler(audio/x-mpegurl) \
mimehandler(audio/x-ms-asf) \
mimehandler(audio/x-ms-asx) \
mimehandler(audio/x-ms-wax) \
mimehandler(audio/x-ms-wma) \
mimehandler(audio/x-musepack) \
mimehandler(audio/x-pn-aiff) \
mimehandler(audio/x-pn-au) \
mimehandler(audio/x-pn-realaudio) \
mimehandler(audio/x-pn-realaudio-plugin) \
mimehandler(audio/x-pn-wav) \
mimehandler(audio/x-pn-windows-acm) \
mimehandler(audio/x-real-audio) \
mimehandler(audio/x-realaudio) \
mimehandler(audio/x-sbc) \
mimehandler(audio/x-scpls) \
mimehandler(audio/x-speex) \
mimehandler(audio/x-tta) \
mimehandler(audio/x-vorbis) \
mimehandler(audio/x-vorbis+ogg) \
mimehandler(audio/x-wav) \
mimehandler(audio/x-wavpack) \
mimehandler(audio/x-xm) \
mimehandler(image/vnd.rn-realpix) \
mimehandler(image/x-pict) \
mimehandler(misc/ultravox) \
mimehandler(text/google-video-pointer) \
mimehandler(text/x-google-video-pointer) \
mimehandler(video/3gpp) \
mimehandler(video/dv) \
mimehandler(video/fli) \
mimehandler(video/flv) \
mimehandler(video/mp2t) \
mimehandler(video/mp4) \
mimehandler(video/mp4v-es) \
mimehandler(video/mpeg) \
mimehandler(video/msvideo) \
mimehandler(video/ogg) \
mimehandler(video/quicktime) \
mimehandler(video/vivo) \
mimehandler(video/vnd.divx) \
mimehandler(video/vnd.rn-realvideo) \
mimehandler(video/vnd.vivo) \
mimehandler(video/webm) \
mimehandler(video/x-anim) \
mimehandler(video/x-avi) \
mimehandler(video/x-flc) \
mimehandler(video/x-fli) \
mimehandler(video/x-flic) \
mimehandler(video/x-flv) \
mimehandler(video/x-m4v) \
mimehandler(video/x-matroska) \
mimehandler(video/x-mpeg) \
mimehandler(video/x-ms-asf) \
mimehandler(video/x-ms-asx) \
mimehandler(video/x-ms-wm) \
mimehandler(video/x-ms-wmv) \
mimehandler(video/x-ms-wmx) \
mimehandler(video/x-ms-wvx) \
mimehandler(video/x-msvideo) \
mimehandler(video/x-nsv) \
mimehandler(video/x-ogm+ogg) \
mimehandler(video/x-theora+ogg) \
mimehandler(video/x-totem-stream) \
mimehandler(x-content/video-dvd) \
mimehandler(x-content/video-svcd) \
mimehandler(x-content/video-vcd) \
python3.10dist(epymc) \
python3dist(epymc)"
RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/python3 \
python(abi) \
python3-efl"

inherit rpm
