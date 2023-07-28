SUMMARY = "Hyprland screenshot utility"
DESCRIPTION = "Hyprshot is a utility to take screenshot in Hyprland using the mouse. \
 \
It allows taking screenshots of windows, regions and monitors which \
are saved to a folder of choice copied to the clipboard."
LICENSE = "GPL-3.0"

PV = "1.2.2"

RPM_NAME = "hyprshot-1.2.2-1.1.noarch.rpm"
RPM_HASH = "55e463182df42f44d018f60d53834c61a590d5f0d76407543275119ec5c8f03e8b24dc36cc1a3b5179ee6c80e835c1c4f7e3a7a83582cd23cb6d676cf4c8aa27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprshot"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick \
grim \
hyprland \
jq \
libnotify-tools \
slurp \
wl-clipboard"

inherit rpm
