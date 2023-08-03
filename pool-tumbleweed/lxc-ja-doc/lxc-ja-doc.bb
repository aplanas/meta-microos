SUMMARY = "Japanese documentation for lxc"
DESCRIPTION = "Japanese language man pages for lxc."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.3"

RPM_NAME = "lxc-ja-doc-5.0.3-1.1.noarch.rpm"
RPM_HASH = "c613c739325c4551dc83464ad8a9b908956e34dc5a8ddcf0b133e8d3e02d8c9e3ae0118f5a811df7d7bc3619be8a812713d5a5e77fc3e61c9f6693e0decd6470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxc-ja-doc"

RDEPENDS:${PN} += "lxc"

inherit rpm
