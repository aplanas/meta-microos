SUMMARY = "Utilities to check proper 3d support before launching 3d games"
DESCRIPTION = "This package contains various shell scripts which are intended for use by \
3D games packages. These shell scripts can be used to check if direct rendering \
is available before launching an OpenGL game. This package is intended for use \
by other packages and is not intended for direct end user use!"
LICENSE = "SUSE-Public-Domain"

PV = "0.2"

RPM_NAME = "opengl-games-utils-0.2-1.4.noarch.rpm"
RPM_HASH = "ce6985f225701421bc928e8632ba65dc617be781c9cff247c1ba9fab3ce1928eb3019ede7bfe408194837321c49b41f7787a6e703856ba3eaf1a4c6e6493086a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opengl-games-utils"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/glxinfo \
zenity"

inherit rpm
