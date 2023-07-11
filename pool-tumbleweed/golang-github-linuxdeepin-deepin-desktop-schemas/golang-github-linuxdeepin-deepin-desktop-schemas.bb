SUMMARY = "Deepin override tool codes"
DESCRIPTION = "This is a tool for Deepin to creat schemas override profiles. \
 \
This package contains library source intended forbuilding other packages which \
use import path with github.com/linuxdeepin/deepin-desktop-schemas prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "golang-github-linuxdeepin-deepin-desktop-schemas-5.10.11-2.2.noarch.rpm"
RPM_HASH = "e395fd86b117c546cbadb1572884570ead1f424d551ebc6cb4a5b6c57a5a956f4509fd754c6a1e6f9c95f655987eb0238e928001babed0c1addce3a567be9bbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-desktop-schemas"

RDEPENDS:${PN} += "golang-github-linuxdeepin-go-lib"

inherit rpm
