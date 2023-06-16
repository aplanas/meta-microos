SUMMARY = "Plymouth related scripts"
DESCRIPTION = "This package contains scripts that help integrate Plymouth with \
the system."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-scripts-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "6ad222d9170ffa0fdd0fe5a6b24dd1c6baac73f6404fb8adddc4ce1c1edb93872d1c66ca2b97e3ed0bcabe34eb281d1e13caa81f101bc36451b6a5b95edefd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
awk \
dracut \
grep \
plymouth \
sed"

inherit rpm
