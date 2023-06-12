SUMMARY = "Widget to display information about the current song in mpd"
DESCRIPTION = "Displays information about the current song in mpd (via mpc) \
 \
Takes two parameters: \
  * mpd.format: Format string for the song information. Tag values can \
    be put in curly brackets (i.e. {artist}) \
  * mpd.host: MPD host to connect to. (mpc behaviour by default)"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-mpd-2.1.5-3.3.noarch.rpm"
RPM_HASH = "e3c245f9fa8862134807ce731488325ecf6cd41499b86dfa0592d617d1f5c9126a2476a7588dfe2245443134134bea1566f7cbd6dbd48fe0d35bc9af422e3118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-mpd"
RDEPENDS:${PN} += "bumblebee-status \
mpclient"

inherit rpm
