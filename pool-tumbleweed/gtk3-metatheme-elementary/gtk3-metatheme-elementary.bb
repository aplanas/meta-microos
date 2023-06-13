SUMMARY = "GTK+ 3 support for the Elementary GTK theme"
DESCRIPTION = "The official elementary GTK theme designed to be smooth, attractive, fast, \
and usable. \
 \
This package provides the GTK+ 3 support of Elementary."
LICENSE = "GPL-3.0-only"

PV = "5.3.0"

RPM_NAME = "gtk3-metatheme-elementary-5.3.0-1.10.noarch.rpm"
RPM_HASH = "7324980ab60f51f813b52f26822765420eac3a4cca67d0d1e4a66923f0940092c9a05fccb61566b158763ca667bdb68abf18c4fc4bb95a9858b4037baf5fea31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-elementary"

RDEPENDS:${PN} += "metatheme-elementary-common"

inherit rpm
