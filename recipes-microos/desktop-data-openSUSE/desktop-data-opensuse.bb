SUMMARY = "Shared Desktop Files for openSUSE"
DESCRIPTION = "This package contains shared desktop files, like the default \
applications menu structure."
LICENSE = "GPL-2.0-or-later"

PV = "15.2.20200107"

RPM_NAME = "desktop-data-openSUSE-15.2.20200107-2.9.noarch.rpm"
RPM_HASH = "6f6696d5d3bf19b1ac1c97f23809b61548f63635ab72d837311037cbae8b7d7d35c08629fcf90928bceb6d309ce048fb2a45a998933a3c9ca709c8ff68267c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(desktop-data-openSUSE) desktop-branding desktop-data desktop-data-openSUSE desktop-data-openSUSE-extra"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup hicolor-icon-theme wallpaper-branding"

inherit rpm
