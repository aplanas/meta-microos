SUMMARY = "Fullscreen game browser for FS-UAE"
DESCRIPTION = "FS-UAE Arcade is a fullscreen Amiga game browser for FS-UAE."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.63"

RPM_NAME = "fs-uae-arcade-3.1.63-1.9.noarch.rpm"
RPM_HASH = "9ead1ef65968778e258b4ee52956b428adc36740594b25d21ce228100489e993924b945ba8fee4e7560da399f1b7bf6a29f50b86424c1da8e55784186cfe9c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(fs-uae-arcade.desktop) fs-uae-arcade"
RDEPENDS:${PN} += "/usr/bin/python3 fs-uae python3-opengl python3-qt5 python3-requests"

inherit rpm
