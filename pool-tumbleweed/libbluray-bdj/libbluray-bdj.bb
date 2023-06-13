SUMMARY = "Library to access Blu-Ray disk - BD-J support"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-bdj-1.3.4-1.3.noarch.rpm"
RPM_HASH = "6395b50155f6c60cac834e2fef29201fcc931178b0a87d236af55df56d913c5d74e86193c9f69950cb7cb10d4cc120b171fd51d0599a070f44530e1e1becaea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbluray-bdj"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
