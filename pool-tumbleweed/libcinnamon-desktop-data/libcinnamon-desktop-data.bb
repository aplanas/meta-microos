SUMMARY = "Libcinnamon-desktop API -- Common Files"
DESCRIPTION = "cinnamon-desktop contains the libcinnamon-desktop library, the \
cinnamon-about program as well as some desktop-wide documents. \
 \
This package includes files that are shared between several \
Cinnamon applications (configuration schemas)."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "5.8.0"

RPM_NAME = "libcinnamon-desktop-data-5.8.0-1.1.noarch.rpm"
RPM_HASH = "8fc1cc34b623b99253a71964280766e6af6cd7277b43ed6969ed5490fd2c51d140581dc4df3e586c5181f88256c9a299f6020bc4820f7f2ba940d7768fabaa21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-desktop-lang \
libcinnamon-desktop-data"
RDEPENDS:${PN} += "libcinnamon-desktop-data-branding \
pam \
python3-gobject"

inherit rpm
