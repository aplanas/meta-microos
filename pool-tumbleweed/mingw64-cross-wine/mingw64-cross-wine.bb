SUMMARY = "Wine cross runtime"
DESCRIPTION = "This package contains a ready to use wine prefix for \
running cross compiled applications while building \
packages, for example cross compiled test"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "mingw64-cross-wine-1.3.2-1.1.noarch.rpm"
RPM_HASH = "43d092803341f9925643237d8c08009d063b50532799f57a027063e3b3ee699df16a0aa0cf61766b95e9bfc34aff18489b2bcaaf327c4b93ed14d0f8c0e7b472"
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
