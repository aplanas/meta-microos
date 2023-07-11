SUMMARY = "Startdde golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/startdde prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "golang-github-linuxdeepin-startdde-5.9.49-3.1.noarch.rpm"
RPM_HASH = "7840f7ab2c6622d15ad33a7957501447146065788fcd96e280fd97024e46e518e7353351751273de3b53dd0c8b55c7694d1eca51ab2ac9cd4734dd78524b36b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-startdde"

RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api \
golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
