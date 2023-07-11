SUMMARY = "Busybox applets replacing tar"
DESCRIPTION = "This package contains the symlinks to replace tar with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-tar-1.36.1-27.1.noarch.rpm"
RPM_HASH = "a40b33039ce25b1a69db249eda85ecc1cc7985ee4c74ef1633584efb4dcc29a41f53e4133171051daf5988cc0ba29e1c84a16cbfb112e711e79ad46a24dd7319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/tar \
busybox-tar"

RDEPENDS:${PN} += "busybox"

inherit rpm
