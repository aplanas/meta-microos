SUMMARY = "Deepin override tool codes"
DESCRIPTION = "This is a tool for Deepin to creat schemas override profiles. \
 \
This package contains library source intended forbuilding other packages which \
use import path with github.com/linuxdeepin/deepin-desktop-schemas prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "golang-github-linuxdeepin-deepin-desktop-schemas-5.10.11-2.1.noarch.rpm"
RPM_HASH = "afb846b1d91fc8f208eb68cf7935b5f4d77e8115cc81f2433a86a2f3f4fdb884aa9c5e44581415b1c93de58c49dc2b0ce7cb9637459ed3947d63c998245e213c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-desktop-schemas"
RDEPENDS:${PN} += "golang-github-linuxdeepin-go-lib"

inherit rpm
