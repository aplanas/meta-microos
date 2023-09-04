SUMMARY = "MPRIS V2.1 support for mpd"
DESCRIPTION = "mpDris2 provide MPRIS 2 support to mpd (Music Player Daemon). mpDris2 is \
run in the user session and monitors a local or distant mpd server."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "mpDris2-0.9.1-1.3.noarch.rpm"
RPM_HASH = "cc1d2def0e2f784c99cf813e6162b5b8a0d3a3e70ae5374c54523b8abd1e664fd000b5ee1f38400e164da9674004ba73259882b2a81eb2e50994d42efedeaf7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpDris2"

RDEPENDS:${PN} += "/usr/bin/python3 \
perl--MODULE-COMPAT-5.38.0 \
python3-python-mpd2 \
typelib-GLib \
typelib-Notify"

inherit rpm
