SUMMARY = "A zypper commit plugin for calling chkstat"
DESCRIPTION = "This package contains a plugin for zypper that calls `chkstat --system` after \
new packages have been installed. This is helpful for maintaining custom \
entries in /etc/permissions.local."
LICENSE = "GPL-2.0-or-later"

PV = "1699_20230602"

RPM_NAME = "permissions-zypp-plugin-1699_20230602-1.3.noarch.rpm"
RPM_HASH = "06f14d9bbf4f89d3fdddde29dc42e0a8e4bdb5f12d30d7446ac7d27c14e156e52c95471fce3a448c74bd8fbcb433ba7748db70d7482a4f442ab093e5f0546e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "permissions-zypp-plugin"

RDEPENDS:${PN} += "/usr/bin/python3 \
libzypp-plugin-commit \
permissions \
python3-zypp-plugin"

inherit rpm
