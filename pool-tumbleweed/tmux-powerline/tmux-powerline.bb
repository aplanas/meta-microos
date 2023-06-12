SUMMARY = "Powerline for tmux"
DESCRIPTION = "Powerline for tmux. \
 \
Add \
 \
    source /usr/share/tmux/powerline.conf \
 \
to your ~/.tmux.conf file."
LICENSE = "MIT"

PV = "2.8.3"

RPM_NAME = "tmux-powerline-2.8.3-2.2.noarch.rpm"
RPM_HASH = "072276cabf1d580d3a55f4d3d24a4a884c397abc9e7219ed595313760b2777a6591c238cf411b60eda55f91f443e30d40f657d6d715bbb3797786d60a3b536a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tmux-powerline"
RDEPENDS:${PN} += "powerline \
tmux"

inherit rpm
