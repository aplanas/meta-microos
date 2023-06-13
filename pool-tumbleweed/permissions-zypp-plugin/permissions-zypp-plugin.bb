SUMMARY = "A zypper commit plugin for calling chkstat"
DESCRIPTION = "This package contains a plugin for zypper that calls `chkstat --system` after \
new packages have been installed. This is helpful for maintaining custom \
entries in /etc/permissions.local."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230516"

RPM_NAME = "permissions-zypp-plugin-1699_20230516-1.1.noarch.rpm"
RPM_HASH = "a0437e45506ee508c70aac8877358f1b8ce5818021896cdc7441e007fcb2adc645f2c25dfead764da52a59532632e58ec23588b25c2d654a738cb70376f029f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permissions-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
libzypp(plugin:commit) \
permissions \
python3-zypp-plugin"

inherit rpm
