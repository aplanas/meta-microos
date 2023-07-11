SUMMARY = "SUSE Linux Default Permissions config files"
DESCRIPTION = "The actual permissions configuration files, /usr/share/permissions/permission.*."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230602"

RPM_NAME = "permissions-config-1699_20230602-1.3.noarch.rpm"
RPM_HASH = "bec41821ffdf65f41b1db540fdb142d008a5ea95670463a08bb1b56a7b36d1ced4d745f6b4e9383964a5c12f8167cbb54fb8996ab92092eda5756ff4bc66e0bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-permissions-config \
permissions-config"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
chkstat \
fillup \
group-trusted"

inherit rpm
