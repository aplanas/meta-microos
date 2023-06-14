SUMMARY = "Wine cross runtime"
DESCRIPTION = "This package contains a ready to use wine prefix for \
running cross compiled applications while building \
packages, for example cross compiled test"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "mingw64-cross-wine-1.3.1-2.1.noarch.rpm"
RPM_HASH = "caaa04faf244f34b4b140f5142c95fa2c7ee13fbf6caa873851033d0963e62145331d3a7d9b634edb663625a91dce8d81a04b5c07de6b86e285f09fcda9ec7d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-wine \
rpm-macro--mingw64-cross-wine-enable-dns \
rpm-macro--mingw64-cross-wine-init \
rpm-macro--mingw64-cross-wine-run \
rpm-macro--mingw64-cross-wine-start-session"

RDEPENDS:${PN} += "mingw64-filesystem \
wget \
wine-binfmt-standalone \
winetricks \
xorg-x11-server \
xvfb-run"

inherit rpm
