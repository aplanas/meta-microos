SUMMARY = "Translation of man pages in Dutch"
DESCRIPTION = "This package provides translations of man pages in Dutch."
LICENSE = "GPL-3.0-or-later"

PV = "4.20.0"

RPM_NAME = "man-pages-nl-4.20.0-1.1.noarch.rpm"
RPM_HASH = "eb940e79237a13dfc7002c5ffb4d89c000dcb8a715554e49e192cca7ca48affb1b3fd80359b70d3d0a5faca04f89b88dd0853e6d33cf9073fc9969711eb5b0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-nl \
man-pages-nl"

RDEPENDS:${PN} += "man-pages"

inherit rpm
