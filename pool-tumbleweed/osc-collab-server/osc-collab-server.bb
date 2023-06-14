SUMMARY = "Server component for osc collab"
DESCRIPTION = "The server part of osc-plugin-collab, handles package reservations \
and tracks in a database the various versions in devel projects, Factory \
and upstream."
LICENSE = "BSD-3-Clause"

PV = "0.104+26"

RPM_NAME = "osc-collab-server-0.104+26-1.1.noarch.rpm"
RPM_HASH = "727bc7d499f18ae27a0730c63dff0e08109a3c7a6385002d1c1c5963b4aa54f099f7c9f88ef3156a1895558d38a4174c541f91d889e771116b1b4be7737d28e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-osc-collab-server \
osc-collab-server"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/env \
/usr/bin/python3 \
osc \
python3 \
python3-feedparser \
python3-rpm \
python3-sgmllib3k \
python3-xml \
user-osc-collab \
withlock"

inherit rpm
