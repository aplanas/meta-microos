SUMMARY = "MPRIS V2.1 support for mpd"
DESCRIPTION = "mpDris2 provide MPRIS 2 support to mpd (Music Player Daemon). mpDris2 is \
run in the user session and monitors a local or distant mpd server."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-0.9.1-1.2.noarch.rpm"
RPM_HASH = "123a52cba959411faf2b8b9133ed0a52d2cd09aceeb0e84225005b6a4bbcceec2e9690c8b03381034ce946028afae38b1ad5fefff5e258a30650c99b95851066"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpDris2"

RDEPENDS:${PN} += "/usr/bin/python3 \
perl--MODULE-COMPAT-5.36.1 \
python3-python-mpd2 \
typelib-GLib \
typelib-Notify"

inherit rpm
