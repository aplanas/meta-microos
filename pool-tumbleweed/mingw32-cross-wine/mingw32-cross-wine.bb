SUMMARY = "Wine cross runtime"
DESCRIPTION = "This package contains a ready to use wine prefix for \
running cross compiled applications while building \
packages, for example cross compiled test"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "mingw32-cross-wine-1.3.2-2.1.noarch.rpm"
RPM_HASH = "ea7296f49c1e22c7e1a78310a5e4135669b96d24836ed8077ff5621e72d86e155016bc01176752101bb0caa531f72a21c310b89aaf99f920b76348dca241995e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-cross-wine \
rpm-macro--mingw32-cross-wine-enable-dns \
rpm-macro--mingw32-cross-wine-init \
rpm-macro--mingw32-cross-wine-run \
rpm-macro--mingw32-cross-wine-start-session"

RDEPENDS:${PN} += "mingw32-filesystem \
wget \
wine-binfmt-standalone \
winetricks \
xorg-x11-server \
xvfb-run"

inherit rpm
