SUMMARY = "Url wrapper for kanku:// urls"
DESCRIPTION = "A URL wrapper to start kanku from kanku:// urls in the browser."
LICENSE = "GPL-3.0-only"

PV = "0.14.0"

RPM_NAME = "kanku-urlwrapper-0.14.0-1.3.noarch.rpm"
RPM_HASH = "955cb4b83ad606b86158d266c1a851c3d6720b0899a362a40f9684c303eac5144becd32009e2473542ff5198f8863c2d4cd673622003e15c8d845def8820d0c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(kanku-urlwrapper.desktop) \
kanku-urlwrapper \
mimehandler(x-scheme-handler/kanku)"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
kanku-cli \
shared-mime-info"

inherit rpm
