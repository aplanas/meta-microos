SUMMARY = "Noto Sans Japanese Font - Black"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Black weight of \
Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-black-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "8621620f04e9cc0bd3c28acad6b452df53799c3b2e88e1e393cc326db3f97688b649c56f260c3972c249ef03d1f2a8d822324c807dcf4714d0f877705f711fce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-black-fonts \
noto-sans-jp-black-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
