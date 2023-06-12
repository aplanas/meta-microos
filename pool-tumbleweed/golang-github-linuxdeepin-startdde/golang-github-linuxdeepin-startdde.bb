SUMMARY = "Startdde golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/startdde prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "golang-github-linuxdeepin-startdde-5.9.49-2.4.noarch.rpm"
RPM_HASH = "be2de39c994912cfd9687d4d32591f822f5ff62e127be19a47970a62a510e53ca51f16561cca793260fe47399035caa92cefaa64ed223758949ad8eb84c6b71d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-startdde"
RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api \
golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
