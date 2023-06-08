SUMMARY = "A bitmap programming font"
DESCRIPTION = "A bitmap font with great coverage of all the glyphs \
that might encounter in the terminal."
LICENSE = "MIT"

PV = "1.19.0"

RPM_NAME = "cozette-fonts-1.19.0-1.2.noarch.rpm"
RPM_HASH = "9c8165f068f50bb47c1ba55743c8aee6a98c8e8e21d9f502babc1f85585e8ed331d6b29f9161dbff15d3d282fa8c2b5eaf7c2a928cceff9950e12f0f57aa4320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozette-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
