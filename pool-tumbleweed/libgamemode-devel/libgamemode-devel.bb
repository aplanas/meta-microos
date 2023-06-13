SUMMARY = "Headers for compiling games using GameMode"
DESCRIPTION = "GameMode is a daemon/lib combo for Linux that allows games to request \
a set of optimisations be temporarily applied to the host OS. \
 \
This package contains the headers required to compile games with \
built-in GameMode support."
LICENSE = "BSD-3-Clause"

PV = "1.7"

RPM_NAME = "libgamemode-devel-1.7-3.1.aarch64.rpm"
RPM_HASH = "113be1db073698c58be7661fc8a727053677c101ceac28e38936beaa546fb1fc9ec5a74ea02e0fb8b7a50c1e56960af04073218c9d40eb575c75b5e3f1b6a590"

RPROVIDES:${PN} += "libgamemode-devel \
libgamemode-devel(aarch-64) \
pkgconfig(gamemode) \
pkgconfig(libgamemodeauto)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgamemode0 \
libgamemodeauto0"

inherit rpm
