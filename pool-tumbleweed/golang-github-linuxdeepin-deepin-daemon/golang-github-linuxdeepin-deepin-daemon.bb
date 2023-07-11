SUMMARY = "Deepin daemon golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/daemon prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "golang-github-linuxdeepin-deepin-daemon-5.14.45-2.5.noarch.rpm"
RPM_HASH = "5fe23360ea0df05e4b8a98667ea0ce87bf6b6e74303d60c61f412d871c07e5fa3c13861fb439c67348568834cbe2b853966dce0c4bdf6b752db8b15090ada459"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-daemon"

RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api \
golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
