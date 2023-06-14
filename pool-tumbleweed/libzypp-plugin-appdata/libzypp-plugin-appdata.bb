SUMMARY = "libzypp extension to handle AppStream metadata"
DESCRIPTION = "This plugin extends libzypp to install AppStream metadata, as extracted from the \
repository metadata, onto the file system in order to be picked up by \
software centers."
LICENSE = "CC0-1.0 & MIT"

PV = "1.0.1+git.20230117"

RPM_NAME = "libzypp-plugin-appdata-1.0.1+git.20230117-2.1.noarch.rpm"
RPM_HASH = "2ee93cffe8976cee28f4cfe440497c016a985137bc998b5b6aa0dcf963f0514cc2d5e72699c70cd11c21d118d8aa392c1250a4974001e89955ee0a8f7f5a6091"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appstream-provider \
libzypp-plugin-appdata"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/python3 \
appstream-glib \
libzypp \
python3-cmdln \
python3-createrepo-c \
zypper"

inherit rpm
