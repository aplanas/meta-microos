SUMMARY = "Media Player Information"
DESCRIPTION = "This package contains a repository of data files describing media player \
(mostly USB Mass Storage ones) capabilities. These files contain information \
about the directory layout to use to add music to these devices, about the \
supported file formats, ... These capabilities used to be provided by HAL \
in the 10-usb-music-players.fdi file but had to be moved elsewhere as part \
of the big HALectomy."
LICENSE = "BSD-3-Clause"

PV = "24"

RPM_NAME = "media-player-info-24-1.9.noarch.rpm"
RPM_HASH = "547d277be641f71984da57082b34b5dfd136213dd280c07c7b519a9911643af900fd76a6dcd54536dd9f16598ed9a5688be05628292f21d901829e4aba06c04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "media-player-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
