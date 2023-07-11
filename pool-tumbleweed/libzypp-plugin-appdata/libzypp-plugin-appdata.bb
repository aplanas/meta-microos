SUMMARY = "libzypp extension to handle AppStream metadata"
DESCRIPTION = "This plugin extends libzypp to install AppStream metadata, as extracted from the \
repository metadata, onto the file system in order to be picked up by \
software centers."
LICENSE = "CC0-1.0 & MIT"

PV = "1.0.1+git.20230117"

RPM_NAME = "libzypp-plugin-appdata-1.0.1+git.20230117-2.2.noarch.rpm"
RPM_HASH = "16b31748498b50ef4b9b5946c3a81b1ad415efddea1e72407019eaf358464dedcad5bb96d1d0cc789463ef7ed66df1108a8fd922062f8391eee6d7935084f16b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appstream-provider \
libzypp-plugin-appdata"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
appstream-glib \
libzypp \
python3-cmdln \
python3-createrepo-c \
zypper"

inherit rpm
