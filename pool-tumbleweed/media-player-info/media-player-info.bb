SUMMARY = "Media Player Information"
DESCRIPTION = "This package contains a repository of data files describing media player \
(mostly USB Mass Storage ones) capabilities. These files contain information \
about the directory layout to use to add music to these devices, about the \
supported file formats, ... These capabilities used to be provided by HAL \
in the 10-usb-music-players.fdi file but had to be moved elsewhere as part \
of the big HALectomy."
LICENSE = "BSD-3-Clause"

PV = "24"

RPM_NAME = "media-player-info-24-1.10.noarch.rpm"
RPM_HASH = "8e88eabd423eb6d3031e1c501c5519d3f3704c84d817c4de2d335ad9b2b0a49af24e39d56fbe61be45d2a62deb7cf08f9ac2cfc591ddd52e9e86e9fd3e9648d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "media-player-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
