SUMMARY = "SUSE Linux Default Permissions config files"
DESCRIPTION = "The actual permissions configuration files, /usr/share/permissions/permission.*."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230516"

RPM_NAME = "permissions-config-1699_20230516-1.1.noarch.rpm"
RPM_HASH = "e2fbe84dd265060d8747e1e09ba534a6d3e5ae76e7bef981389673cc8fa7ba1c043771928664c96eede85e41a05f837135426973bf34828d4da71470d45d4ef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(permissions-config) \
permissions-config"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
chkstat \
fillup \
group(trusted)"

inherit rpm
