SUMMARY = "Library to handle network protocol transport in X"
DESCRIPTION = "xtrans is a library of code that is shared among various X packages to \
handle network protocol transport in a modular fashion, allowing a \
single place to add new transport types. It is used by the X server, \
libX11, libICE, the X font server, and related components."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "xtrans-1.5.0-1.1.noarch.rpm"
RPM_HASH = "74c11d73c068311b6808aaba8bc79d6aa684e3bb765ac2fb1b8bb7f1d26d79af708166860a74b44d3bff1f50041fbe8172b214db7af69181f12a033c91bc0412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xtrans \
xorg-x11-xtrans-devel \
xtrans"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
