SUMMARY = "A bitmap programming font"
DESCRIPTION = "A bitmap font with great coverage of all the glyphs \
that might encounter in the terminal."
LICENSE = "MIT"

PV = "1.21.0"

RPM_NAME = "cozette-fonts-1.21.0-1.1.noarch.rpm"
RPM_HASH = "9be25d530b5b064e2348de4d879ce92c1ab23e1663078e662b6031e0c62b9e2617ad1f42bc27b6222faff769c3088ce4db5d52fb6735d6d86d8d4aca31f971bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cozette-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
