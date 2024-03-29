SUMMARY = "Client to synchronize media playback on mpv/VLC on multiple computers"
DESCRIPTION = "The client application for Syncplay, allows you to play media in \
synchronization with other users around the world, making movie \
nights even across countries possible."
LICENSE = "Apache-2.0"

PV = "1.7.0"

RPM_NAME = "syncplay-client-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "cc217daccf0fe68015904f5f84c94642e90dc333c015bd404b7e815778fb8e223f0378aa05d6a1ab5234b1a0be643a67fcdaebb34e1afdc514c3679065716824"

RPROVIDES:${PN} += "syncplay-client"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3-Twisted \
syncplay-common"

inherit rpm
