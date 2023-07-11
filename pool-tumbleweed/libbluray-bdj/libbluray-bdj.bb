SUMMARY = "Library to access Blu-Ray disk - BD-J support"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.4"

RPM_NAME = "libbluray-bdj-1.3.4-1.4.noarch.rpm"
RPM_HASH = "70521c8d9b07514f4badf059b701531688d197b3fbb869b839b91ac944b3401ba8ff7f814df1d31a290ce59e1c30a82c01d614a27066347335098ed764857f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libbluray-bdj"

RDEPENDS:${PN} += "java \
jpackage-utils"

inherit rpm
